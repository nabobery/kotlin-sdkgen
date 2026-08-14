package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/token_card_networks
 */
@Serializable(with = TokenCardNetworks.Serializer::class)
public class TokenCardNetworks(
  /**
   * The preferred network for co-branded cards. Can be `cartes_bancaires`, `mastercard`, `visa` or `invalid_preference`
   * if requested network is not valid for the card.
   */
  public val preferred: String? = null,
) {
  public class Builder {
    /**
     * The preferred network for co-branded cards. Can be `cartes_bancaires`, `mastercard`, `visa` or
     * `invalid_preference` if requested network is not valid for the card.
     */
    public var preferred: String? = null

    public fun build(): TokenCardNetworks = TokenCardNetworks(
      preferred = preferred,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TokenCardNetworks = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TokenCardNetworks> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TokenCardNetworks {
      val jsonDecoder = decoder.requireJsonDecoder("TokenCardNetworks")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TokenCardNetworks must be a JSON object")
      return TokenCardNetworks(
        preferred = rawObject["preferred"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TokenCardNetworks) {
      val jsonEncoder = encoder.requireJsonEncoder("TokenCardNetworks")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.preferred?.let { put("preferred", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun tokenCardNetworks(block: TokenCardNetworks.Builder.() -> Unit): TokenCardNetworks = TokenCardNetworks.build(block)
