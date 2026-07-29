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
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces~1secrets/get/responses/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces~1secrets/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineUserCodespacesSecretsGetResponse200JsonXaa96d197.Serializer::class)
public class InlineUserCodespacesSecretsGetResponse200JsonXaa96d197(
  secrets: List<CodespacesSecret>,
  public val totalCount: Int,
) {
  public val secrets: List<CodespacesSecret> = secrets.toList()

  public class Builder {
    private var secretsValue: List<CodespacesSecret>? = null

    public var secrets: List<CodespacesSecret>
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

    public fun build(): InlineUserCodespacesSecretsGetResponse200JsonXaa96d197 {
      check(secretsValue != null) { "secrets is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineUserCodespacesSecretsGetResponse200JsonXaa96d197(
        secrets = secrets,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserCodespacesSecretsGetResponse200JsonXaa96d197 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUserCodespacesSecretsGetResponse200JsonXaa96d197> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserCodespacesSecretsGetResponse200JsonXaa96d197 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserCodespacesSecretsGetResponse200JsonXaa96d197")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserCodespacesSecretsGetResponse200JsonXaa96d197 must be a JSON object")
      val secrets = json.decodeRequired<List<CodespacesSecret>>(rawObject, "secrets")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineUserCodespacesSecretsGetResponse200JsonXaa96d197(
        secrets = secrets,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserCodespacesSecretsGetResponse200JsonXaa96d197) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserCodespacesSecretsGetResponse200JsonXaa96d197")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("secrets", json.encodeToJsonElement(value.secrets))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserCodespacesSecretsGetResponse200JsonXaa96d197(block: InlineUserCodespacesSecretsGetResponse200JsonXaa96d197.Builder.() -> Unit): InlineUserCodespacesSecretsGetResponse200JsonXaa96d197 = InlineUserCodespacesSecretsGetResponse200JsonXaa96d197.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUserCodespacesSecretsGetResponse200JsonXaa96d197 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
