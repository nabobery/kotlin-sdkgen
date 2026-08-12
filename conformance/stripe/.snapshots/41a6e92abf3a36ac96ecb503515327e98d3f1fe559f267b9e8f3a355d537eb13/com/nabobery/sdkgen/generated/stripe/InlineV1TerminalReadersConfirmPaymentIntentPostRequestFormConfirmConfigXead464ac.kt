package com.nabobery.sdkgen.generated.stripe

import kotlin.String
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
import kotlinx.serialization.json.put

/**
 * Configuration overrides for this confirmation, such as surcharge settings and return URL.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1confirm_payment_intent/post/requestBody/conten
 * t/application~1x-www-form-urlencoded/schema/properties/confirm_config
 */
@Serializable(with = InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormConfirmConfigXead464ac.Serializer::class)
public class InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormConfirmConfigXead464ac(
  public val returnUrl: String? = null,
) {
  public class Builder {
    public var returnUrl: String? = null

    public fun build(): InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormConfirmConfigXead464ac = InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormConfirmConfigXead464ac(
      returnUrl = returnUrl,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormConfirmConfigXead464ac = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormConfirmConfigXead464ac> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormConfirmConfigXead464ac {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormConfirmConfigXead464ac")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormConfirmConfigXead464ac must be a JSON object")
      return InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormConfirmConfigXead464ac(
        returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormConfirmConfigXead464ac) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormConfirmConfigXead464ac")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.returnUrl?.let { put("return_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalReadersConfirmPaymentIntentPostRequestFormConfirmConfigXead464ac(block: InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormConfirmConfigXead464ac.Builder.() -> Unit): InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormConfirmConfigXead464ac = InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormConfirmConfigXead464ac.build(block)
