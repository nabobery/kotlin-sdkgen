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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/us_cfpb_data/properties/race_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/us_cfpb_data/properties/race_details
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsXbb944d69.Serializer::class)
public class InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsXbb944d69(
  race: List<InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsRaceItemX3fa49d82>? = null,
  public val raceOther: String? = null,
) {
  public val race: List<InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsRaceItemX3fa49d82>?
      = race?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var raceValue:
        List<InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsRaceItemX3fa49d82>? = null

    public var race:
        List<InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsRaceItemX3fa49d82>?
      get() = raceValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        raceValue = value?.let { collection0 -> collection0.toList() }
      }

    public var raceOther: String? = null

    public fun build(): InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsXbb944d69 = InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsXbb944d69(
      race = race,
      raceOther = raceOther,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsXbb944d69 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsXbb944d69> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsXbb944d69 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsXbb944d69")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsXbb944d69 must be a JSON object")
      return InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsXbb944d69(
        race = rawObject["race"]?.let { json.decodeFromJsonElement<List<InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsRaceItemX3fa49d82>>(it) },
        raceOther = rawObject["race_other"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsXbb944d69) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsXbb944d69")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.race?.let { put("race", json.encodeToJsonElement(it)) }
        value.raceOther?.let { put("race_other", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsXbb944d69(block: InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsXbb944d69.Builder.() -> Unit): InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsXbb944d69 = InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsXbb944d69.build(block)
