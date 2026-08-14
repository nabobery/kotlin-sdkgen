package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces/get/responses/200/content/application~1json/s
 * chema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces/get/responses/200/content/application~1json/s
 * chema
 */
@Serializable(with = InlineUsersCopilotSpacesGetResponse200JsonXc06296f1.Serializer::class)
public class InlineUsersCopilotSpacesGetResponse200JsonXc06296f1(
  spaces: List<CopilotSpace>,
) {
  /**
   * The list of Copilot Spaces on this page of results.
   */
  public val spaces: List<CopilotSpace> = spaces.toList()

  public class Builder {
    private var spacesValue: List<CopilotSpace>? = null

    public var spaces: List<CopilotSpace>
      get() = requireNotNull(spacesValue) { "spaces is required" }.toList()
      set(`value`) {
        spacesValue = value.toList()
      }

    public fun build(): InlineUsersCopilotSpacesGetResponse200JsonXc06296f1 {
      check(spacesValue != null) { "spaces is required" }
      return InlineUsersCopilotSpacesGetResponse200JsonXc06296f1(
        spaces = spaces,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersCopilotSpacesGetResponse200JsonXc06296f1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUsersCopilotSpacesGetResponse200JsonXc06296f1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesGetResponse200JsonXc06296f1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersCopilotSpacesGetResponse200JsonXc06296f1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersCopilotSpacesGetResponse200JsonXc06296f1 must be a JSON object")
      val spaces = json.decodeRequired<List<CopilotSpace>>(rawObject, "spaces")
      return InlineUsersCopilotSpacesGetResponse200JsonXc06296f1(
        spaces = spaces,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesGetResponse200JsonXc06296f1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersCopilotSpacesGetResponse200JsonXc06296f1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("spaces", json.encodeToJsonElement(value.spaces))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsersCopilotSpacesGetResponse200JsonXc06296f1(block: InlineUsersCopilotSpacesGetResponse200JsonXc06296f1.Builder.() -> Unit): InlineUsersCopilotSpacesGetResponse200JsonXc06296f1 = InlineUsersCopilotSpacesGetResponse200JsonXc06296f1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUsersCopilotSpacesGetResponse200JsonXc06296f1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
