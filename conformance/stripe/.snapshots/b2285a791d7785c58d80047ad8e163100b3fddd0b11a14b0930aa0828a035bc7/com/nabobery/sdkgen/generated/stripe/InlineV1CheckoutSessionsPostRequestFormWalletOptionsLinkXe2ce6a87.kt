package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/wallet_options/properties/link.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/wallet_options/properties/link
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkXe2ce6a87.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkXe2ce6a87(
  public val display:
      InlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkDisplayX1e72ca09? = null,
) {
  public class Builder {
    public var display: InlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkDisplayX1e72ca09? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkXe2ce6a87 = InlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkXe2ce6a87(
      display = display,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkXe2ce6a87 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkXe2ce6a87> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkXe2ce6a87 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkXe2ce6a87")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkXe2ce6a87 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkXe2ce6a87(
        display = rawObject["display"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkDisplayX1e72ca09>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkXe2ce6a87) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkXe2ce6a87")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.display?.let { put("display", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkXe2ce6a87(block: InlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkXe2ce6a87.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkXe2ce6a87 = InlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkXe2ce6a87.build(block)
