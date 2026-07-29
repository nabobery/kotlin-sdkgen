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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1hosted-runners~1images~1github-owned/get/responses/200/co
 * ntent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1hosted-runners~1images~1github-owned/get/responses/200/co
 * ntent/application~1json/schema
 */
@Serializable(with = InlineOrgsActionsHostedRunnersImagesGithubOwnedGetResponse200JsonXc739a3ee.Serializer::class)
public class InlineOrgsActionsHostedRunnersImagesGithubOwnedGetResponse200JsonXc739a3ee(
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

    public fun build(): InlineOrgsActionsHostedRunnersImagesGithubOwnedGetResponse200JsonXc739a3ee {
      check(imagesValue != null) { "images is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsActionsHostedRunnersImagesGithubOwnedGetResponse200JsonXc739a3ee(
        images = images,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsHostedRunnersImagesGithubOwnedGetResponse200JsonXc739a3ee = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsActionsHostedRunnersImagesGithubOwnedGetResponse200JsonXc739a3ee> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsHostedRunnersImagesGithubOwnedGetResponse200JsonXc739a3ee {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsHostedRunnersImagesGithubOwnedGetResponse200JsonXc739a3ee")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsHostedRunnersImagesGithubOwnedGetResponse200JsonXc739a3ee must be a JSON object")
      val images = json.decodeRequired<List<ActionsHostedRunnerCuratedImage>>(rawObject, "images")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsActionsHostedRunnersImagesGithubOwnedGetResponse200JsonXc739a3ee(
        images = images,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsHostedRunnersImagesGithubOwnedGetResponse200JsonXc739a3ee) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsHostedRunnersImagesGithubOwnedGetResponse200JsonXc739a3ee")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("images", json.encodeToJsonElement(value.images))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsHostedRunnersImagesGithubOwnedGetResponse200JsonXc739a3ee(block: InlineOrgsActionsHostedRunnersImagesGithubOwnedGetResponse200JsonXc739a3ee.Builder.() -> Unit): InlineOrgsActionsHostedRunnersImagesGithubOwnedGetResponse200JsonXc739a3ee = InlineOrgsActionsHostedRunnersImagesGithubOwnedGetResponse200JsonXc739a3ee.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsHostedRunnersImagesGithubOwnedGetResponse200JsonXc739a3ee is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
