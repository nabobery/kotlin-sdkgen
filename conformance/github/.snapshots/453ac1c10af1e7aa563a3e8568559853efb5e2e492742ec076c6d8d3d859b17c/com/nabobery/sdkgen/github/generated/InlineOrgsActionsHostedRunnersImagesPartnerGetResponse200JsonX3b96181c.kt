package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1hosted-runners~1images~1partner/get/responses/200/content
 * /application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1hosted-runners~1images~1partner/get/responses/200/content
 * /application~1json/schema
 */
@Serializable(with = InlineOrgsActionsHostedRunnersImagesPartnerGetResponse200JsonX3b96181c.Serializer::class)
public class InlineOrgsActionsHostedRunnersImagesPartnerGetResponse200JsonX3b96181c(
  images: List<ActionsHostedRunnerCuratedImage>,
  public val totalCount: Int,
) {
  public val images: List<ActionsHostedRunnerCuratedImage> = images.toList()

  public class Builder {
    private var imagesValue: List<ActionsHostedRunnerCuratedImage>? = null

    public var images: List<ActionsHostedRunnerCuratedImage>
      get() = requireNotNull(imagesValue) { "images is required" }.toList()
      set(`value`) {
        imagesValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineOrgsActionsHostedRunnersImagesPartnerGetResponse200JsonX3b96181c {
      check(imagesValue != null) { "images is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsActionsHostedRunnersImagesPartnerGetResponse200JsonX3b96181c(
        images = images,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsHostedRunnersImagesPartnerGetResponse200JsonX3b96181c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsActionsHostedRunnersImagesPartnerGetResponse200JsonX3b96181c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsHostedRunnersImagesPartnerGetResponse200JsonX3b96181c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsHostedRunnersImagesPartnerGetResponse200JsonX3b96181c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsHostedRunnersImagesPartnerGetResponse200JsonX3b96181c must be a JSON object")
      val images = json.decodeRequired<List<ActionsHostedRunnerCuratedImage>>(rawObject, "images")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsActionsHostedRunnersImagesPartnerGetResponse200JsonX3b96181c(
        images = images,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsHostedRunnersImagesPartnerGetResponse200JsonX3b96181c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsHostedRunnersImagesPartnerGetResponse200JsonX3b96181c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("images", json.encodeToJsonElement(value.images))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsHostedRunnersImagesPartnerGetResponse200JsonX3b96181c(block: InlineOrgsActionsHostedRunnersImagesPartnerGetResponse200JsonX3b96181c.Builder.() -> Unit): InlineOrgsActionsHostedRunnersImagesPartnerGetResponse200JsonX3b96181c = InlineOrgsActionsHostedRunnersImagesPartnerGetResponse200JsonX3b96181c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsHostedRunnersImagesPartnerGetResponse200JsonX3b96181c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
