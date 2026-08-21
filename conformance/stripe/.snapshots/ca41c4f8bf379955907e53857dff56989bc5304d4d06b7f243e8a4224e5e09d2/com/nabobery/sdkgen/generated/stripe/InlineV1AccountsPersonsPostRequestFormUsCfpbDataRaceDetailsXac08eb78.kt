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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/us_cfpb_data/properties/race_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/us_cfpb_data/properties/race_details
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXac08eb78.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXac08eb78(
  race: List<InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemXf1f01fa0>? = null,
  public val raceOther: String? = null,
) {
  public val race:
      List<InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemXf1f01fa0>? =
      race?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var raceValue:
        List<InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemXf1f01fa0>? = null

    public var race:
        List<InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemXf1f01fa0>?
      get() = raceValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        raceValue = value?.let { collection0 -> collection0.toList() }
      }

    public var raceOther: String? = null

    public fun build(): InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXac08eb78 = InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXac08eb78(
      race = race,
      raceOther = raceOther,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXac08eb78 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXac08eb78> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXac08eb78 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXac08eb78")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXac08eb78 must be a JSON object")
      return InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXac08eb78(
        race = rawObject["race"]?.let { json.decodeFromJsonElement<List<InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemXf1f01fa0>>(it) },
        raceOther = rawObject["race_other"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXac08eb78) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXac08eb78")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.race?.let { put("race", json.encodeToJsonElement(it)) }
        value.raceOther?.let { put("race_other", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXac08eb78(block: InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXac08eb78.Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXac08eb78 = InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXac08eb78.build(block)
