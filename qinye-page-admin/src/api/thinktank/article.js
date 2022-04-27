import request from '@/utils/request'

// 查询智库文章列表
export function listArticle(query) {
  return request({
    url: '/thinktank/article/list',
    method: 'get',
    params: query
  })
}

// 查询智库文章详细
export function getArticle(id) {
  return request({
    url: '/thinktank/article/' + id,
    method: 'get'
  })
}

// 新增智库文章
export function addArticle(data) {
  return request({
    url: '/thinktank/article',
    method: 'post',
    data: data
  })
}

// 修改智库文章
export function updateArticle(data) {
  return request({
    url: '/thinktank/article',
    method: 'put',
    data: data
  })
}

// 删除智库文章
export function delArticle(id) {
  return request({
    url: '/thinktank/article/' + id,
    method: 'delete'
  })
}

// 导出智库文章
export function exportArticle(query) {
  return request({
    url: '/thinktank/article/export',
    method: 'get',
    params: query
  })
}
