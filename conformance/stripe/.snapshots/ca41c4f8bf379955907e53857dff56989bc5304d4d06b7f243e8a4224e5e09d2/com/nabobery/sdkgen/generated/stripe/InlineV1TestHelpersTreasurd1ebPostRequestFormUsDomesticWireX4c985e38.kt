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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_transfers~1{outbound_transfer}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/tracking_details/properties/us_domestic_wire.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_transfers~1{outbound_transfer}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/tracking_details/properties/us_domestic_wire
 */
@Serializable(with = InlineV1TestHelpersTreasurd1ebPostRequestFormUsDomesticWireX4c985e38.Serializer::class)
public class InlineV1TestHelpersTreasurd1ebPostRequestFormUsDomesticWireX4c985e38(
  public val chips: String? = null,
  public val imad: String? = null,
  public val omad: String? = null,
) {
  public class Builder {
    public var chips: String? = null

    public var imad: String? = null

    public var omad: String? = null

    public fun build(): InlineV1TestHelpersTreasurd1ebPostRequestFormUsDomesticWireX4c985e38 = InlineV1TestHelpersTreasurd1ebPostRequestFormUsDomesticWireX4c985e38(
      chips = chips,
      imad = imad,
      omad = omad,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersTreasurd1ebPostRequestFormUsDomesticWireX4c985e38 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersTreasurd1ebPostRequestFormUsDomesticWireX4c985e38> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTreasurd1ebPostRequestFormUsDomesticWireX4c985e38 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersTreasurd1ebPostRequestFormUsDomesticWireX4c985e38")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersTreasurd1ebPostRequestFormUsDomesticWireX4c985e38 must be a JSON object")
      return InlineV1TestHelpersTreasurd1ebPostRequestFormUsDomesticWireX4c985e38(
        chips = rawObject["chips"]?.let { json.decodeFromJsonElement<String>(it) },
        imad = rawObject["imad"]?.let { json.decodeFromJsonElement<String>(it) },
        omad = rawObject["omad"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTreasurd1ebPostRequestFormUsDomesticWireX4c985e38) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersTreasurd1ebPostRequestFormUsDomesticWireX4c985e38")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.chips?.let { put("chips", it) }
        value.imad?.let { put("imad", it) }
        value.omad?.let { put("omad", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersTreasurd1ebPostRequestFormUsDomesticWireX4c985e38(block: InlineV1TestHelpersTreasurd1ebPostRequestFormUsDomesticWireX4c985e38.Builder.() -> Unit): InlineV1TestHelpersTreasurd1ebPostRequestFormUsDomesticWireX4c985e38 = InlineV1TestHelpersTreasurd1ebPostRequestFormUsDomesticWireX4c985e38.build(block)
