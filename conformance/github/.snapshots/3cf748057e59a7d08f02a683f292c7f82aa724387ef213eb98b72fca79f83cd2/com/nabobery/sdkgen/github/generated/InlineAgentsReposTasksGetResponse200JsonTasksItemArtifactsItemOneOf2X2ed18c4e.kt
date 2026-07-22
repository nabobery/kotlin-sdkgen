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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/get/responses/200/content/application~1js
 * on/schema/properties/tasks/items/properties/artifacts/items/properties/data/oneOf/1
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e.Serializer::class)
public class InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e(
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

    public fun build(): InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e {
      check(baseRefValue != null) { "baseRef is required" }
      check(headRefValue != null) { "headRef is required" }
      return InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e(
        baseRef = baseRef,
        headRef = headRef,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e must be a JSON object")
      val baseRef = json.decodeRequired<String>(rawObject, "base_ref")
      val headRef = json.decodeRequired<String>(rawObject, "head_ref")
      return InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e(
        baseRef = baseRef,
        headRef = headRef,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("base_ref", value.baseRef)
        put("head_ref", value.headRef)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e(block: InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e.Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e = InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
