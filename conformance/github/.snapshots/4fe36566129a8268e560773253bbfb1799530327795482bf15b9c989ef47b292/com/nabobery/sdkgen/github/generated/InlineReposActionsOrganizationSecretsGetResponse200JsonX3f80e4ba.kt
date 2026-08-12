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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1organization-secrets/get/responses/200/content
 * /application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1organization-secrets/get/responses/200/content
 * /application~1json/schema
 */
@Serializable(with = InlineReposActionsOrganizationSecretsGetResponse200JsonX3f80e4ba.Serializer::class)
public class InlineReposActionsOrganizationSecretsGetResponse200JsonX3f80e4ba(
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

    public fun build(): InlineReposActionsOrganizationSecretsGetResponse200JsonX3f80e4ba {
      check(secretsValue != null) { "secrets is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineReposActionsOrganizationSecretsGetResponse200JsonX3f80e4ba(
        secrets = secrets,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposActionsOrganizationSecretsGetResponse200JsonX3f80e4ba = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposActionsOrganizationSecretsGetResponse200JsonX3f80e4ba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposActionsOrganizationSecretsGetResponse200JsonX3f80e4ba {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposActionsOrganizationSecretsGetResponse200JsonX3f80e4ba")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposActionsOrganizationSecretsGetResponse200JsonX3f80e4ba must be a JSON object")
      val secrets = json.decodeRequired<List<ActionsSecret>>(rawObject, "secrets")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineReposActionsOrganizationSecretsGetResponse200JsonX3f80e4ba(
        secrets = secrets,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsOrganizationSecretsGetResponse200JsonX3f80e4ba) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposActionsOrganizationSecretsGetResponse200JsonX3f80e4ba")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("secrets", json.encodeToJsonElement(value.secrets))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposActionsOrganizationSecretsGetResponse200JsonX3f80e4ba(block: InlineReposActionsOrganizationSecretsGetResponse200JsonX3f80e4ba.Builder.() -> Unit): InlineReposActionsOrganizationSecretsGetResponse200JsonX3f80e4ba = InlineReposActionsOrganizationSecretsGetResponse200JsonX3f80e4ba.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposActionsOrganizationSecretsGetResponse200JsonX3f80e4ba is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
