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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1hosted-runners~1images~1custom/get/responses/200/content/
 * application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1hosted-runners~1images~1custom/get/responses/200/content/
 * application~1json/schema
 */
@Serializable(with = InlineOrgsActionsHostedRunnersImagesCustomGetResponse200JsonX0ba24716.Serializer::class)
public class InlineOrgsActionsHostedRunnersImagesCustomGetResponse200JsonX0ba24716(
  images: List<ActionsHostedRunnerCustomImage>,
  public val totalCount: Int,
) {
  public val images: List<ActionsHostedRunnerCustomImage> = images.toList()

  public class Builder {
    private var imagesValue: List<ActionsHostedRunnerCustomImage>? = null

    public var images: List<ActionsHostedRunnerCustomImage>
      get() = requireNotNull(imagesValue) { "images is required" }
      set(`value`) {
        imagesValue = value
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineOrgsActionsHostedRunnersImagesCustomGetResponse200JsonX0ba24716 {
      check(imagesValue != null) { "images is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsActionsHostedRunnersImagesCustomGetResponse200JsonX0ba24716(
        images = images,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsHostedRunnersImagesCustomGetResponse200JsonX0ba24716 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsActionsHostedRunnersImagesCustomGetResponse200JsonX0ba24716> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsHostedRunnersImagesCustomGetResponse200JsonX0ba24716 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsHostedRunnersImagesCustomGetResponse200JsonX0ba24716")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsHostedRunnersImagesCustomGetResponse200JsonX0ba24716 must be a JSON object")
      val images = json.decodeRequired<List<ActionsHostedRunnerCustomImage>>(rawObject, "images")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsActionsHostedRunnersImagesCustomGetResponse200JsonX0ba24716(
        images = images,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsHostedRunnersImagesCustomGetResponse200JsonX0ba24716) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsHostedRunnersImagesCustomGetResponse200JsonX0ba24716")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("images", json.encodeToJsonElement(value.images))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsHostedRunnersImagesCustomGetResponse200JsonX0ba24716(block: InlineOrgsActionsHostedRunnersImagesCustomGetResponse200JsonX0ba24716.Builder.() -> Unit): InlineOrgsActionsHostedRunnersImagesCustomGetResponse200JsonX0ba24716 = InlineOrgsActionsHostedRunnersImagesCustomGetResponse200JsonX0ba24716.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsHostedRunnersImagesCustomGetResponse200JsonX0ba24716 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
