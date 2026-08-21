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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}~1resources/get/responses/200/conten
 * t/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}~1resources/get/responses/200/conten
 * t/application~1json/schema
 */
@Serializable(with = InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a.Serializer::class)
public class InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a(
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

    public fun build(): InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a {
      check(resourcesValue != null) { "resources is required" }
      return InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a(
        resources = resources,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a must be a JSON object")
      val resources = json.decodeRequired<List<CopilotSpaceResource>>(rawObject, "resources")
      return InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a(
        resources = resources,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("resources", json.encodeToJsonElement(value.resources))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a(block: InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a.Builder.() -> Unit): InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a = InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
