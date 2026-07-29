package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1agents~1organization-secrets/get/responses/200/content/
 * application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1agents~1organization-secrets/get/responses/200/content/
 * application~1json/schema
 */
@Serializable(with = InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94.Serializer::class)
public class InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94(
  secrets: List<ActionsSecret>,
  public val totalCount: Int,
) {
  public val secrets: List<ActionsSecret> = secrets.toList()

  public class Builder {
    private var secretsValue: List<ActionsSecret>? = null

    public var secrets: List<ActionsSecret>
      get() = requireNotNull(secretsValue) { "secrets is required" }.toList()
      set(`value`) {
        secretsValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94 {
      check(secretsValue != null) { "secrets is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94(
        secrets = secrets,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94 must be a JSON object")
      val secrets = json.decodeRequired<List<ActionsSecret>>(rawObject, "secrets")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94(
        secrets = secrets,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("secrets", json.encodeToJsonElement(value.secrets))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94(block: InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94.Builder.() -> Unit): InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94 = InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
