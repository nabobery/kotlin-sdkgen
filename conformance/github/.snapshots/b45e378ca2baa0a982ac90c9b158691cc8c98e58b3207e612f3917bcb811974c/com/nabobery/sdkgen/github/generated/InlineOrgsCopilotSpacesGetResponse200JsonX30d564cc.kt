package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces/get/responses/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc.Serializer::class)
public class InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc(
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

    public fun build(): InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc {
      check(spacesValue != null) { "spaces is required" }
      return InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc(
        spaces = spaces,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc must be a JSON object")
      val spaces = json.decodeRequired<List<CopilotSpace>>(rawObject, "spaces")
      return InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc(
        spaces = spaces,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("spaces", json.encodeToJsonElement(value.spaces))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotSpacesGetResponse200JsonX30d564cc(block: InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc.Builder.() -> Unit): InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc = InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
