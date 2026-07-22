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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1codespaces~1secrets/get/responses/200/content/application~1json/sc
 * hema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1codespaces~1secrets/get/responses/200/content/application~1json/sc
 * hema
 */
@Serializable(with = InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae.Serializer::class)
public class InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae(
  secrets: List<CodespacesOrgSecret>,
  public val totalCount: Int,
) {
  public val secrets: List<CodespacesOrgSecret> = secrets.toList()

  public class Builder {
    private var secretsValue: List<CodespacesOrgSecret>? = null

    public var secrets: List<CodespacesOrgSecret>
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

    public fun build(): InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae {
      check(secretsValue != null) { "secrets is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae(
        secrets = secrets,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae must be a JSON object")
      val secrets = json.decodeRequired<List<CodespacesOrgSecret>>(rawObject, "secrets")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae(
        secrets = secrets,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("secrets", json.encodeToJsonElement(value.secrets))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCodespacesSecretsGetResponse200JsonX276108ae(block: InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae.Builder.() -> Unit): InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae = InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
