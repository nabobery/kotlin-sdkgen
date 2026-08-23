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
 * Wallet-specific configuration.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/wallet_options
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormWalletOptionsX76a7ca24.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormWalletOptionsX76a7ca24(
  public val link: InlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkXe2ce6a87? = null,
) {
  public class Builder {
    public var link: InlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkXe2ce6a87? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormWalletOptionsX76a7ca24 = InlineV1CheckoutSessionsPostRequestFormWalletOptionsX76a7ca24(
      link = link,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormWalletOptionsX76a7ca24 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormWalletOptionsX76a7ca24> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormWalletOptionsX76a7ca24 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormWalletOptionsX76a7ca24")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormWalletOptionsX76a7ca24 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormWalletOptionsX76a7ca24(
        link = rawObject["link"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormWalletOptionsLinkXe2ce6a87>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormWalletOptionsX76a7ca24) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormWalletOptionsX76a7ca24")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.link?.let { put("link", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormWalletOptionsX76a7ca24(block: InlineV1CheckoutSessionsPostRequestFormWalletOptionsX76a7ca24.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormWalletOptionsX76a7ca24 = InlineV1CheckoutSessionsPostRequestFormWalletOptionsX76a7ca24.build(block)
