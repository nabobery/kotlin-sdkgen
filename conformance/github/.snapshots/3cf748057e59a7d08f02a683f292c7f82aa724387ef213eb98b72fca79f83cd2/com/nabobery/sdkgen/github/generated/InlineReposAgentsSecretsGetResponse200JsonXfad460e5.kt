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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1agents~1secrets/get/responses/200/content/application~1
 * json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1agents~1secrets/get/responses/200/content/application~1
 * json/schema
 */
@Serializable(with = InlineReposAgentsSecretsGetResponse200JsonXfad460e5.Serializer::class)
public class InlineReposAgentsSecretsGetResponse200JsonXfad460e5(
  secrets: List<ActionsSecret>,
  public val totalCount: Int,
) {
  public val secrets: List<ActionsSecret> = secrets.toList()

  public class Builder {
    private var secretsValue: List<ActionsSecret>? = null

    public var secrets: List<ActionsSecret>
      get() = requireNotNull(secretsValue) { "secrets is required" }
      set(`value`) {
        secretsValue = value
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineReposAgentsSecretsGetResponse200JsonXfad460e5 {
      check(secretsValue != null) { "secrets is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineReposAgentsSecretsGetResponse200JsonXfad460e5(
        secrets = secrets,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposAgentsSecretsGetResponse200JsonXfad460e5 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposAgentsSecretsGetResponse200JsonXfad460e5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposAgentsSecretsGetResponse200JsonXfad460e5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposAgentsSecretsGetResponse200JsonXfad460e5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposAgentsSecretsGetResponse200JsonXfad460e5 must be a JSON object")
      val secrets = json.decodeRequired<List<ActionsSecret>>(rawObject, "secrets")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineReposAgentsSecretsGetResponse200JsonXfad460e5(
        secrets = secrets,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposAgentsSecretsGetResponse200JsonXfad460e5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposAgentsSecretsGetResponse200JsonXfad460e5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("secrets", json.encodeToJsonElement(value.secrets))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposAgentsSecretsGetResponse200JsonXfad460e5(block: InlineReposAgentsSecretsGetResponse200JsonXfad460e5.Builder.() -> Unit): InlineReposAgentsSecretsGetResponse200JsonXfad460e5 = InlineReposAgentsSecretsGetResponse200JsonXfad460e5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposAgentsSecretsGetResponse200JsonXfad460e5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
