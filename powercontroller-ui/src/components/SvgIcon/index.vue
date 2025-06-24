<template>
  <!-- :style 动态绑定样式 -->
  <div v-if="isExternal" :style="styleExternalIcon" class="svg-external-icon svg-icon" v-on="$listeners" />
  <svg v-else :class="svgClass" aria-hidden="true" v-on="$listeners">
    <use :xlink:href="iconName" />
    <!-- 这是一个 SVG 的 <use> 元素，用于引用外部的 SVG 图标。 -->
  </svg>
</template>

<script>
// doc: https://panjiachen.github.io/vue-element-admin-site/feature/component/svg-icon.html#usage
// 导入工具，并准备使用
// 类型: :style 绑定的是 CSS 样式，而 :class 绑定的是 CSS 类名

// 事件监听器: 当父组件使用 v-on 或 @ 语法为子组件绑定事件时，这些事件监听器会被添加到 $listeners 中。

import { isExternal } from '@/utils/validate'

export default {
  name: 'SvgIcon',
  props: {
    // 描述元数据类型
    iconClass: {
      type: String,
      required: true
    },
    className: {
      type: String,
      default: ''
    }
  },
  computed: {
    // 计算属性强大的地方在于，当会 影响其值的存储属性发生变化时，计算属性也会同步进行更新
    isExternal() {
      return isExternal(this.iconClass)
    },
    iconName() {
      return `#icon-${this.iconClass}`
    },
    svgClass() {
      if (this.className) {
        return 'svg-icon ' + this.className
      } else {
        return 'svg-icon'
      }
    },
    styleExternalIcon() {
      return {
        mask: `url(${this.iconClass}) no-repeat 50% 50%`,
        '-webkit-mask': `url(${this.iconClass}) no-repeat 50% 50%`
      }
    }
  }
}
</script>

<style scoped>
.svg-icon {
  width: 1em;
  height: 1em;
  vertical-align: -0.15em;
  fill: currentColor;
  overflow: hidden;
}

.svg-external-icon {
  background-color: currentColor;
  mask-size: cover!important;
  display: inline-block;
}
</style>
