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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs/post/requestBody/content/application~1json/s
 * chema/properties/actions/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs/post/requestBody/content/application~1json/s
 * chema/properties/actions/items
 */
@Serializable(with = InlineReposCheckRunsPostRequestJsonActionsItemXe51b5607.Serializer::class)
public class InlineReposCheckRunsPostRequestJsonActionsItemXe51b5607(
  /**
   * A short explanation of what this action would do. The maximum size is 40 characters.
   */
  public val description: String,
  /**
   * A reference for the action on the integrator's system. The maximum size is 20 characters.
   */
  public val identifier: String,
  /**
   * The text to be displayed on a button in the web UI. The maximum size is 20 characters.
   */
  public val label: String,
) {
  public class Builder {
    private var descriptionValue: String? = null

    public var description: String
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
      }

    private var identifierValue: String? = null

    public var identifier: String
      get() = requireNotNull(identifierValue) { "identifier is required" }
      set(`value`) {
        identifierValue = value
      }

    private var labelValue: String? = null

    public var label: String
      get() = requireNotNull(labelValue) { "label is required" }
      set(`value`) {
        labelValue = value
      }

    public fun build(): InlineReposCheckRunsPostRequestJsonActionsItemXe51b5607 {
      check(descriptionValue != null) { "description is required" }
      check(identifierValue != null) { "identifier is required" }
      check(labelValue != null) { "label is required" }
      return InlineReposCheckRunsPostRequestJsonActionsItemXe51b5607(
        description = description,
        identifier = identifier,
        label = label,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCheckRunsPostRequestJsonActionsItemXe51b5607 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposCheckRunsPostRequestJsonActionsItemXe51b5607> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPostRequestJsonActionsItemXe51b5607 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCheckRunsPostRequestJsonActionsItemXe51b5607")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCheckRunsPostRequestJsonActionsItemXe51b5607 must be a JSON object")
      val description = json.decodeRequired<String>(rawObject, "description")
      val identifier = json.decodeRequired<String>(rawObject, "identifier")
      val label = json.decodeRequired<String>(rawObject, "label")
      return InlineReposCheckRunsPostRequestJsonActionsItemXe51b5607(
        description = description,
        identifier = identifier,
        label = label,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPostRequestJsonActionsItemXe51b5607) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCheckRunsPostRequestJsonActionsItemXe51b5607")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("description", value.description)
        put("identifier", value.identifier)
        put("label", value.label)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCheckRunsPostRequestJsonActionsItemXe51b5607(block: InlineReposCheckRunsPostRequestJsonActionsItemXe51b5607.Builder.() -> Unit): InlineReposCheckRunsPostRequestJsonActionsItemXe51b5607 = InlineReposCheckRunsPostRequestJsonActionsItemXe51b5607.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCheckRunsPostRequestJsonActionsItemXe51b5607 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
