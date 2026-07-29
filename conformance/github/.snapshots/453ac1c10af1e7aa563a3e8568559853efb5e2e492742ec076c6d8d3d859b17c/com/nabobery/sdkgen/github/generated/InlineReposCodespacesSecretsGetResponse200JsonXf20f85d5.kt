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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1codespaces~1secrets/get/responses/200/content/applicati
 * on~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1codespaces~1secrets/get/responses/200/content/applicati
 * on~1json/schema
 */
@Serializable(with = InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5.Serializer::class)
public class InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5(
  secrets: List<RepoCodespacesSecret>,
  public val totalCount: Int,
) {
  public val secrets: List<RepoCodespacesSecret> = secrets.toList()

  public class Builder {
    private var secretsValue: List<RepoCodespacesSecret>? = null

    public var secrets: List<RepoCodespacesSecret>
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

    public fun build(): InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5 {
      check(secretsValue != null) { "secrets is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5(
        secrets = secrets,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5 must be a JSON object")
      val secrets = json.decodeRequired<List<RepoCodespacesSecret>>(rawObject, "secrets")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5(
        secrets = secrets,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("secrets", json.encodeToJsonElement(value.secrets))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCodespacesSecretsGetResponse200JsonXf20f85d5(block: InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5.Builder.() -> Unit): InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5 = InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
