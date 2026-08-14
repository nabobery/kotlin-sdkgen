package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/200/content/application~1json/schema/all
 * Of/0/properties/artifacts/items/properties/data/oneOf/1
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f.Serializer::class)
public class InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f(
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

    public fun build(): InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f {
      check(baseRefValue != null) { "baseRef is required" }
      check(headRefValue != null) { "headRef is required" }
      return InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f(
        baseRef = baseRef,
        headRef = headRef,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f must be a JSON object")
      val baseRef = json.decodeRequired<String>(rawObject, "base_ref")
      val headRef = json.decodeRequired<String>(rawObject, "head_ref")
      return InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f(
        baseRef = baseRef,
        headRef = headRef,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("base_ref", value.baseRef)
        put("head_ref", value.headRef)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f(block: InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f.Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f = InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
