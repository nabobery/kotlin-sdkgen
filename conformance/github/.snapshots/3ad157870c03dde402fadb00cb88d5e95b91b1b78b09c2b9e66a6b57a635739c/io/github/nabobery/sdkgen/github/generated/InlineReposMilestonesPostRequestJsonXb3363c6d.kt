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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1milestones/post/requestBody/content/application~1json/s
 * chema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1milestones/post/requestBody/content/application~1json/s
 * chema
 */
@Serializable(with = InlineReposMilestonesPostRequestJsonXb3363c6d.Serializer::class)
public class InlineReposMilestonesPostRequestJsonXb3363c6d(
  /**
   * The title of the milestone.
   */
  public val title: String,
  /**
   * A description of the milestone.
   */
  public val description: String? = null,
  /**
   * The milestone due date. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format:
   * `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val dueOn: String? = null,
  /**
   * The state of the milestone. Either `open` or `closed`.
   */
  public val state: InlineReposMilestonesPostRequestJsonStateXb896e86f? = null,
) {
  public class Builder {
    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    /**
     * A description of the milestone.
     */
    public var description: String? = null

    /**
     * The milestone due date. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format:
     * `YYYY-MM-DDTHH:MM:SSZ`.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var dueOn: String? = null

    /**
     * The state of the milestone. Either `open` or `closed`.
     */
    public var state: InlineReposMilestonesPostRequestJsonStateXb896e86f? = null

    public fun build(): InlineReposMilestonesPostRequestJsonXb3363c6d {
      check(titleValue != null) { "title is required" }
      return InlineReposMilestonesPostRequestJsonXb3363c6d(
        title = title,
        description = description,
        dueOn = dueOn,
        state = state,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposMilestonesPostRequestJsonXb3363c6d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposMilestonesPostRequestJsonXb3363c6d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposMilestonesPostRequestJsonXb3363c6d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposMilestonesPostRequestJsonXb3363c6d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposMilestonesPostRequestJsonXb3363c6d must be a JSON object")
      val title = json.decodeRequired<String>(rawObject, "title")
      return InlineReposMilestonesPostRequestJsonXb3363c6d(
        title = title,
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        dueOn = rawObject["due_on"]?.let { json.decodeFromJsonElement<String>(it) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<InlineReposMilestonesPostRequestJsonStateXb896e86f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposMilestonesPostRequestJsonXb3363c6d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposMilestonesPostRequestJsonXb3363c6d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("title", value.title)
        value.description?.let { put("description", it) }
        value.dueOn?.let { put("due_on", it) }
        value.state?.let { put("state", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposMilestonesPostRequestJsonXb3363c6d(block: InlineReposMilestonesPostRequestJsonXb3363c6d.Builder.() -> Unit): InlineReposMilestonesPostRequestJsonXb3363c6d = InlineReposMilestonesPostRequestJsonXb3363c6d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposMilestonesPostRequestJsonXb3363c6d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
