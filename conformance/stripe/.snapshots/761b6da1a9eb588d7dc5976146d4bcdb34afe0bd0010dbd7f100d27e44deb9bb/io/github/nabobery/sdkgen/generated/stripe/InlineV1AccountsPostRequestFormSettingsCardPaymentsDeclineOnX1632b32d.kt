package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/card_payments/properties/decline_on.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/card_payments/properties/decline_on
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX1632b32d.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX1632b32d(
  public val avsFailure: Boolean? = null,
  public val cvcFailure: Boolean? = null,
) {
  public class Builder {
    public var avsFailure: Boolean? = null

    public var cvcFailure: Boolean? = null

    public fun build(): InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX1632b32d = InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX1632b32d(
      avsFailure = avsFailure,
      cvcFailure = cvcFailure,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX1632b32d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX1632b32d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX1632b32d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX1632b32d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX1632b32d must be a JSON object")
      return InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX1632b32d(
        avsFailure = rawObject["avs_failure"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        cvcFailure = rawObject["cvc_failure"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX1632b32d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX1632b32d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.avsFailure?.let { put("avs_failure", json.encodeToJsonElement(it)) }
        value.cvcFailure?.let { put("cvc_failure", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX1632b32d(block: InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX1632b32d.Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX1632b32d = InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX1632b32d.build(block)
