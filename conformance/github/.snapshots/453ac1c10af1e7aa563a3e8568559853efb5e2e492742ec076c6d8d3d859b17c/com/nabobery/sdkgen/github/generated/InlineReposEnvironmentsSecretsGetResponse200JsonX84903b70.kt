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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1environments~1{environment_name}~1secrets/get/responses
 * /200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1environments~1{environment_name}~1secrets/get/responses
 * /200/content/application~1json/schema
 */
@Serializable(with = InlineReposEnvironmentsSecretsGetResponse200JsonX84903b70.Serializer::class)
public class InlineReposEnvironmentsSecretsGetResponse200JsonX84903b70(
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

    public fun build(): InlineReposEnvironmentsSecretsGetResponse200JsonX84903b70 {
      check(secretsValue != null) { "secrets is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineReposEnvironmentsSecretsGetResponse200JsonX84903b70(
        secrets = secrets,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposEnvironmentsSecretsGetResponse200JsonX84903b70 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposEnvironmentsSecretsGetResponse200JsonX84903b70> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposEnvironmentsSecretsGetResponse200JsonX84903b70 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposEnvironmentsSecretsGetResponse200JsonX84903b70")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposEnvironmentsSecretsGetResponse200JsonX84903b70 must be a JSON object")
      val secrets = json.decodeRequired<List<ActionsSecret>>(rawObject, "secrets")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineReposEnvironmentsSecretsGetResponse200JsonX84903b70(
        secrets = secrets,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposEnvironmentsSecretsGetResponse200JsonX84903b70) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposEnvironmentsSecretsGetResponse200JsonX84903b70")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("secrets", json.encodeToJsonElement(value.secrets))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposEnvironmentsSecretsGetResponse200JsonX84903b70(block: InlineReposEnvironmentsSecretsGetResponse200JsonX84903b70.Builder.() -> Unit): InlineReposEnvironmentsSecretsGetResponse200JsonX84903b70 = InlineReposEnvironmentsSecretsGetResponse200JsonX84903b70.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposEnvironmentsSecretsGetResponse200JsonX84903b70 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
