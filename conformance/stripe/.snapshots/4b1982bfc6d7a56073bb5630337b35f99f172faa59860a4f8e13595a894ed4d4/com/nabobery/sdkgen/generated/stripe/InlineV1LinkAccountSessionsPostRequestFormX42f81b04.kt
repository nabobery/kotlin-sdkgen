package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1link_account_sessions/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1link_account_sessions/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema
 */
@Serializable(with = InlineV1LinkAccountSessionsPostRequestFormX42f81b04.Serializer::class)
public class InlineV1LinkAccountSessionsPostRequestFormX42f81b04(
  /**
   * The account holder to link accounts for.
   */
  public val accountHolder: InlineV1LinkAccountSessionsPostRequestFormAccountHolderXf956ba1a,
  permissions: List<InlineV1LinkAccountSessionsPostRequestFormPermissionsItemX0bf81dae>,
  expand: List<String>? = null,
  /**
   * Filters to restrict the kinds of accounts to collect.
   */
  public val filters: InlineV1LinkAccountSessionsPostRequestFormFiltersXa834bef4? = null,
  prefetch: List<InlineV1LinkAccountSessionsPostRequestFormPrefetchItemXf397b7b2>? = null,
  /**
   * For webview integrations only. Upon completing OAuth login in the native browser, the user will be redirected to
   * this URL to return to your app.
   */
  public val returnUrl: String? = null,
) {
  /**
   * List of data features that you would like to request access to.
   *
   * Possible values are `balances`, `transactions`, `ownership`, and `payment_method`.
   */
  public val permissions: List<InlineV1LinkAccountSessionsPostRequestFormPermissionsItemX0bf81dae> =
      permissions.toList()

  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * List of data features that you would like to retrieve upon account creation.
   */
  public val prefetch: List<InlineV1LinkAccountSessionsPostRequestFormPrefetchItemXf397b7b2>? =
      prefetch?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var accountHolderValue:
        InlineV1LinkAccountSessionsPostRequestFormAccountHolderXf956ba1a? = null

    public var accountHolder: InlineV1LinkAccountSessionsPostRequestFormAccountHolderXf956ba1a
      get() = requireNotNull(accountHolderValue) { "accountHolder is required" }
      set(`value`) {
        accountHolderValue = value
      }

    private var permissionsValue:
        List<InlineV1LinkAccountSessionsPostRequestFormPermissionsItemX0bf81dae>? = null

    public var permissions: List<InlineV1LinkAccountSessionsPostRequestFormPermissionsItemX0bf81dae>
      get() = requireNotNull(permissionsValue) { "permissions is required" }.toList()
      set(`value`) {
        permissionsValue = value.toList()
      }

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Filters to restrict the kinds of accounts to collect.
     */
    public var filters: InlineV1LinkAccountSessionsPostRequestFormFiltersXa834bef4? = null

    private var prefetchValue:
        List<InlineV1LinkAccountSessionsPostRequestFormPrefetchItemXf397b7b2>? = null

    /**
     * List of data features that you would like to retrieve upon account creation.
     */
    public var prefetch: List<InlineV1LinkAccountSessionsPostRequestFormPrefetchItemXf397b7b2>?
      get() = prefetchValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        prefetchValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * For webview integrations only. Upon completing OAuth login in the native browser, the user will be redirected to
     * this URL to return to your app.
     */
    public var returnUrl: String? = null

    public fun build(): InlineV1LinkAccountSessionsPostRequestFormX42f81b04 {
      check(accountHolderValue != null) { "accountHolder is required" }
      check(permissionsValue != null) { "permissions is required" }
      return InlineV1LinkAccountSessionsPostRequestFormX42f81b04(
        accountHolder = accountHolder,
        permissions = permissions,
        expand = expand,
        filters = filters,
        prefetch = prefetch,
        returnUrl = returnUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1LinkAccountSessionsPostRequestFormX42f81b04 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1LinkAccountSessionsPostRequestFormX42f81b04> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1LinkAccountSessionsPostRequestFormX42f81b04 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1LinkAccountSessionsPostRequestFormX42f81b04")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1LinkAccountSessionsPostRequestFormX42f81b04 must be a JSON object")
      val accountHolder = json.decodeRequired<InlineV1LinkAccountSessionsPostRequestFormAccountHolderXf956ba1a>(rawObject, "account_holder")
      val permissions = json.decodeRequired<List<InlineV1LinkAccountSessionsPostRequestFormPermissionsItemX0bf81dae>>(rawObject, "permissions")
      return InlineV1LinkAccountSessionsPostRequestFormX42f81b04(
        accountHolder = accountHolder,
        permissions = permissions,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        filters = rawObject["filters"]?.let { json.decodeFromJsonElement<InlineV1LinkAccountSessionsPostRequestFormFiltersXa834bef4>(it) },
        prefetch = rawObject["prefetch"]?.let { json.decodeFromJsonElement<List<InlineV1LinkAccountSessionsPostRequestFormPrefetchItemXf397b7b2>>(it) },
        returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1LinkAccountSessionsPostRequestFormX42f81b04) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1LinkAccountSessionsPostRequestFormX42f81b04")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account_holder", json.encodeToJsonElement(value.accountHolder))
        put("permissions", json.encodeToJsonElement(value.permissions))
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.filters?.let { put("filters", json.encodeToJsonElement(it)) }
        value.prefetch?.let { put("prefetch", json.encodeToJsonElement(it)) }
        value.returnUrl?.let { put("return_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1LinkAccountSessionsPostRequestFormX42f81b04(block: InlineV1LinkAccountSessionsPostRequestFormX42f81b04.Builder.() -> Unit): InlineV1LinkAccountSessionsPostRequestFormX42f81b04 = InlineV1LinkAccountSessionsPostRequestFormX42f81b04.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1LinkAccountSessionsPostRequestFormX42f81b04 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
