package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
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
import kotlinx.serialization.json.put

/**
 * A Git branch reference
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/post/responses/201/content/application~1j
 * son/schema/properties/artifacts/items/properties/data/oneOf/1
 */
@Serializable(with = InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919.Serializer::class)
public class InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919(
  /**
   * Base branch name
   */
  public val baseRef: String,
  /**
   * Head branch name
   */
  public val headRef: String,
) {
  public class Builder {
    private var baseRefValue: String? = null

    public var baseRef: String
      get() = requireNotNull(baseRefValue) { "baseRef is required" }
      set(`value`) {
        baseRefValue = value
      }

    private var headRefValue: String? = null

    public var headRef: String
      get() = requireNotNull(headRefValue) { "headRef is required" }
      set(`value`) {
        headRefValue = value
      }

    public fun build(): InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919 {
      check(baseRefValue != null) { "baseRef is required" }
      check(headRefValue != null) { "headRef is required" }
      return InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919(
        baseRef = baseRef,
        headRef = headRef,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919 must be a JSON object")
      val baseRef = json.decodeRequired<String>(rawObject, "base_ref")
      val headRef = json.decodeRequired<String>(rawObject, "head_ref")
      return InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919(
        baseRef = baseRef,
        headRef = headRef,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("base_ref", value.baseRef)
        put("head_ref", value.headRef)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919(block: InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919.Builder.() -> Unit): InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919 = InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
