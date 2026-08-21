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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}~1resources/get/responses/200/
 * content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}~1resources/get/responses/200/
 * content/application~1json/schema
 */
@Serializable(with = InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a.Serializer::class)
public class InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a(
  resources: List<CopilotSpaceResource>,
) {
  /**
   * The list of resources attached to this Copilot Space.
   */
  public val resources: List<CopilotSpaceResource> = resources.toList()

  public class Builder {
    private var resourcesValue: List<CopilotSpaceResource>? = null

    public var resources: List<CopilotSpaceResource>
      get() = requireNotNull(resourcesValue) { "resources is required" }.toList()
      set(`value`) {
        resourcesValue = value.toList()
      }

    public fun build(): InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a {
      check(resourcesValue != null) { "resources is required" }
      return InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a(
        resources = resources,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a must be a JSON object")
      val resources = json.decodeRequired<List<CopilotSpaceResource>>(rawObject, "resources")
      return InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a(
        resources = resources,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("resources", json.encodeToJsonElement(value.resources))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a(block: InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a.Builder.() -> Unit): InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a = InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
