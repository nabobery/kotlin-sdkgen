package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1coding-agent~1permissions~1repositories/get/responses/200
 * /content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1coding-agent~1permissions~1repositories/get/responses/200
 * /content/application~1json/schema
 */
@Serializable(with = InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef.Serializer::class)
public class InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef(
  repositories: List<MinimalRepository>,
  public val totalCount: Int,
) {
  public val repositories: List<MinimalRepository> = repositories.toList()

  public class Builder {
    private var repositoriesValue: List<MinimalRepository>? = null

    public var repositories: List<MinimalRepository>
      get() = requireNotNull(repositoriesValue) { "repositories is required" }.toList()
      set(`value`) {
        repositoriesValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef {
      check(repositoriesValue != null) { "repositories is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef(
        repositories = repositories,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef must be a JSON object")
      val repositories = json.decodeRequired<List<MinimalRepository>>(rawObject, "repositories")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef(
        repositories = repositories,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repositories", json.encodeToJsonElement(value.repositories))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef(block: InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef.Builder.() -> Unit): InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef = InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
