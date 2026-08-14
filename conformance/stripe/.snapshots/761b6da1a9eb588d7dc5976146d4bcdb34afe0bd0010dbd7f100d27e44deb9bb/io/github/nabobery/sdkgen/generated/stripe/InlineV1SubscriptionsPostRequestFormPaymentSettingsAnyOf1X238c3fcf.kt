package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf(
  public val mandateOptions:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsXb846a9bd? = null,
  public val network: InlineV1SubscriptionsPostRequestFormPaymentSettingsNetworkXc68f05b0? = null,
  public val requestThreeDSecure:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsRequestThreeDSecureX83960604? = null,
) {
  public class Builder {
    public var mandateOptions:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsXb846a9bd? = null

    public var network: InlineV1SubscriptionsPostRequestFormPaymentSettingsNetworkXc68f05b0? = null

    public var requestThreeDSecure:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsRequestThreeDSecureX83960604? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf = InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf(
      mandateOptions = mandateOptions,
      network = network,
      requestThreeDSecure = requestThreeDSecure,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf must be a JSON object")
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsXb846a9bd>(it) },
        network = rawObject["network"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsNetworkXc68f05b0>(it) },
        requestThreeDSecure = rawObject["request_three_d_secure"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsRequestThreeDSecureX83960604>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.network?.let { put("network", json.encodeToJsonElement(it)) }
        value.requestThreeDSecure?.let { put("request_three_d_secure", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf(block: InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf = InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf.build(block)
