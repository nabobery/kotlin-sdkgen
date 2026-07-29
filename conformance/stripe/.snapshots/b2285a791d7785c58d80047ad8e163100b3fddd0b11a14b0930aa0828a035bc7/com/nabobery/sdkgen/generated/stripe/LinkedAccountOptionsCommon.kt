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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/linked_account_options_common
 */
@Serializable(with = LinkedAccountOptionsCommon.Serializer::class)
public class LinkedAccountOptionsCommon(
  public val filters:
      PaymentFlowsPrivatePaymentMethodsFinancialConnectionsCommonLinkedAccountOptionsFilters? = null,
  permissions: List<InlineLinkedAccountOptionsCommonPermissionsItemX23a646ba>? = null,
  prefetch: List<InlineLinkedAccountOptionsCommonPrefetchItemX42e66787>? = null,
  /**
   * For webview integrations only. Upon completing OAuth login in the native browser, the user will be redirected to
   * this URL to return to your app.
   */
  public val returnUrl: String? = null,
) {
  /**
   * The list of permissions to request. The `payment_method` permission must be included.
   */
  public val permissions: List<InlineLinkedAccountOptionsCommonPermissionsItemX23a646ba>? =
      permissions?.let { collection0 -> collection0.toList() }

  /**
   * Data features requested to be retrieved upon account creation.
   */
  public val prefetch: List<InlineLinkedAccountOptionsCommonPrefetchItemX42e66787>? =
      prefetch?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var filters:
        PaymentFlowsPrivatePaymentMethodsFinancialConnectionsCommonLinkedAccountOptionsFilters? =
        null

    private var permissionsValue: List<InlineLinkedAccountOptionsCommonPermissionsItemX23a646ba>? =
        null

    /**
     * The list of permissions to request. The `payment_method` permission must be included.
     */
    public var permissions: List<InlineLinkedAccountOptionsCommonPermissionsItemX23a646ba>?
      get() = permissionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        permissionsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var prefetchValue: List<InlineLinkedAccountOptionsCommonPrefetchItemX42e66787>? = null

    /**
     * Data features requested to be retrieved upon account creation.
     */
    public var prefetch: List<InlineLinkedAccountOptionsCommonPrefetchItemX42e66787>?
      get() = prefetchValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        prefetchValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * For webview integrations only. Upon completing OAuth login in the native browser, the user will be redirected to
     * this URL to return to your app.
     */
    public var returnUrl: String? = null

    public fun build(): LinkedAccountOptionsCommon = LinkedAccountOptionsCommon(
      filters = filters,
      permissions = permissions,
      prefetch = prefetch,
      returnUrl = returnUrl,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): LinkedAccountOptionsCommon = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<LinkedAccountOptionsCommon> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LinkedAccountOptionsCommon {
      val jsonDecoder = decoder.requireJsonDecoder("LinkedAccountOptionsCommon")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("LinkedAccountOptionsCommon must be a JSON object")
      return LinkedAccountOptionsCommon(
        filters = rawObject["filters"]?.let { json.decodeFromJsonElement<PaymentFlowsPrivatePaymentMethodsFinancialConnectionsCommonLinkedAccountOptionsFilters>(it) },
        permissions = rawObject["permissions"]?.let { json.decodeFromJsonElement<List<InlineLinkedAccountOptionsCommonPermissionsItemX23a646ba>>(it) },
        prefetch = rawObject["prefetch"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineLinkedAccountOptionsCommonPrefetchItemX42e66787>?>(element) },
        returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: LinkedAccountOptionsCommon) {
      val jsonEncoder = encoder.requireJsonEncoder("LinkedAccountOptionsCommon")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.filters?.let { put("filters", json.encodeToJsonElement(it)) }
        value.permissions?.let { put("permissions", json.encodeToJsonElement(it)) }
        value.prefetch?.let { put("prefetch", json.encodeToJsonElement(it)) }
        value.returnUrl?.let { put("return_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun linkedAccountOptionsCommon(block: LinkedAccountOptionsCommon.Builder.() -> Unit): LinkedAccountOptionsCommon = LinkedAccountOptionsCommon.build(block)
