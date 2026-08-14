package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1hosted-runners~1images~1custom~1{image_definition_id}~1ve
 * rsions/get/responses/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1hosted-runners~1images~1custom~1{image_definition_id}~1ve
 * rsions/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineOrgsActionsHostedRunnersImagesCustomVersionsGetResponse200JsonX13b9cba0.Serializer::class)
public class InlineOrgsActionsHostedRunnersImagesCustomVersionsGetResponse200JsonX13b9cba0(
  imageVersions: List<ActionsHostedRunnerCustomImageVersion>,
  public val totalCount: Int,
) {
  public val imageVersions: List<ActionsHostedRunnerCustomImageVersion> = imageVersions.toList()

  public class Builder {
    private var imageVersionsValue: List<ActionsHostedRunnerCustomImageVersion>? = null

    public var imageVersions: List<ActionsHostedRunnerCustomImageVersion>
      get() = requireNotNull(imageVersionsValue) { "imageVersions is required" }.toList()
      set(`value`) {
        imageVersionsValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineOrgsActionsHostedRunnersImagesCustomVersionsGetResponse200JsonX13b9cba0 {
      check(imageVersionsValue != null) { "imageVersions is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsActionsHostedRunnersImagesCustomVersionsGetResponse200JsonX13b9cba0(
        imageVersions = imageVersions,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsHostedRunnersImagesCustomVersionsGetResponse200JsonX13b9cba0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsActionsHostedRunnersImagesCustomVersionsGetResponse200JsonX13b9cba0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsHostedRunnersImagesCustomVersionsGetResponse200JsonX13b9cba0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsHostedRunnersImagesCustomVersionsGetResponse200JsonX13b9cba0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsHostedRunnersImagesCustomVersionsGetResponse200JsonX13b9cba0 must be a JSON object")
      val imageVersions = json.decodeRequired<List<ActionsHostedRunnerCustomImageVersion>>(rawObject, "image_versions")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsActionsHostedRunnersImagesCustomVersionsGetResponse200JsonX13b9cba0(
        imageVersions = imageVersions,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsHostedRunnersImagesCustomVersionsGetResponse200JsonX13b9cba0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsHostedRunnersImagesCustomVersionsGetResponse200JsonX13b9cba0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("image_versions", json.encodeToJsonElement(value.imageVersions))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsHostedRunnersImagesCustomVersionsGetResponse200JsonX13b9cba0(block: InlineOrgsActionsHostedRunnersImagesCustomVersionsGetResponse200JsonX13b9cba0.Builder.() -> Unit): InlineOrgsActionsHostedRunnersImagesCustomVersionsGetResponse200JsonX13b9cba0 = InlineOrgsActionsHostedRunnersImagesCustomVersionsGetResponse200JsonX13b9cba0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsHostedRunnersImagesCustomVersionsGetResponse200JsonX13b9cba0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
