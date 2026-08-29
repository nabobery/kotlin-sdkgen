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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1agents~1secrets/get/responses/200/content/application~1json/schema
 * .
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1agents~1secrets/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13.Serializer::class)
public class InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13(
  secrets: List<OrganizationActionsSecret>,
  public val totalCount: Int,
) {
  public val secrets: List<OrganizationActionsSecret> = secrets.toList()

  public class Builder {
    private var secretsValue: List<OrganizationActionsSecret>? = null

    public var secrets: List<OrganizationActionsSecret>
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

    public fun build(): InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13 {
      check(secretsValue != null) { "secrets is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13(
        secrets = secrets,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13 must be a JSON object")
      val secrets = json.decodeRequired<List<OrganizationActionsSecret>>(rawObject, "secrets")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13(
        secrets = secrets,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("secrets", json.encodeToJsonElement(value.secrets))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsAgentsSecretsGetResponse200JsonX7745ea13(block: InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13.Builder.() -> Unit): InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13 = InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
