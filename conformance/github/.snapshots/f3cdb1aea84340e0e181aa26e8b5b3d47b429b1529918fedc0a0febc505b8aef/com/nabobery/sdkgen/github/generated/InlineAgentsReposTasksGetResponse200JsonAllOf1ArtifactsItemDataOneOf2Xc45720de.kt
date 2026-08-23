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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks~1{task_id}/get/responses/200/content/appl
 * ication~1json/schema/allOf/0/properties/artifacts/items/properties/data/oneOf/1
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de.Serializer::class)
public class InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de(
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

    public fun build(): InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de {
      check(baseRefValue != null) { "baseRef is required" }
      check(headRefValue != null) { "headRef is required" }
      return InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de(
        baseRef = baseRef,
        headRef = headRef,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de must be a JSON object")
      val baseRef = json.decodeRequired<String>(rawObject, "base_ref")
      val headRef = json.decodeRequired<String>(rawObject, "head_ref")
      return InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de(
        baseRef = baseRef,
        headRef = headRef,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("base_ref", value.baseRef)
        put("head_ref", value.headRef)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de(block: InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de.Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de = InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
