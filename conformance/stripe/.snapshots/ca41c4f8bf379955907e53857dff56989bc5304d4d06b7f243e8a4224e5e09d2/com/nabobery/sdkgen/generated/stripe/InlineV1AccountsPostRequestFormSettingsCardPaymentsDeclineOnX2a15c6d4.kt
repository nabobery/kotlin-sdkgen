package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/card_payments/properties/decline_on.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/card_payments/properties/decline_on
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX2a15c6d4.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX2a15c6d4(
  public val avsFailure: Boolean? = null,
  public val cvcFailure: Boolean? = null,
) {
  public class Builder {
    public var avsFailure: Boolean? = null

    public var cvcFailure: Boolean? = null

    public fun build(): InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX2a15c6d4 = InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX2a15c6d4(
      avsFailure = avsFailure,
      cvcFailure = cvcFailure,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX2a15c6d4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX2a15c6d4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX2a15c6d4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX2a15c6d4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX2a15c6d4 must be a JSON object")
      return InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX2a15c6d4(
        avsFailure = rawObject["avs_failure"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        cvcFailure = rawObject["cvc_failure"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX2a15c6d4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX2a15c6d4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.avsFailure?.let { put("avs_failure", json.encodeToJsonElement(it)) }
        value.cvcFailure?.let { put("cvc_failure", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX2a15c6d4(block: InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX2a15c6d4.Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX2a15c6d4 = InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX2a15c6d4.build(block)
