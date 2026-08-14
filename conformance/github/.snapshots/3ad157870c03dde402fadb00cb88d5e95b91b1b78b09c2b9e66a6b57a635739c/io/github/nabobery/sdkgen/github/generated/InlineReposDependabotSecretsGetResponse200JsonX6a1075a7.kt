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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1dependabot~1secrets/get/responses/200/content/applicati
 * on~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1dependabot~1secrets/get/responses/200/content/applicati
 * on~1json/schema
 */
@Serializable(with = InlineReposDependabotSecretsGetResponse200JsonX6a1075a7.Serializer::class)
public class InlineReposDependabotSecretsGetResponse200JsonX6a1075a7(
  secrets: List<DependabotSecret>,
  public val totalCount: Int,
) {
  public val secrets: List<DependabotSecret> = secrets.toList()

  public class Builder {
    private var secretsValue: List<DependabotSecret>? = null

    public var secrets: List<DependabotSecret>
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

    public fun build(): InlineReposDependabotSecretsGetResponse200JsonX6a1075a7 {
      check(secretsValue != null) { "secrets is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineReposDependabotSecretsGetResponse200JsonX6a1075a7(
        secrets = secrets,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposDependabotSecretsGetResponse200JsonX6a1075a7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposDependabotSecretsGetResponse200JsonX6a1075a7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposDependabotSecretsGetResponse200JsonX6a1075a7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposDependabotSecretsGetResponse200JsonX6a1075a7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposDependabotSecretsGetResponse200JsonX6a1075a7 must be a JSON object")
      val secrets = json.decodeRequired<List<DependabotSecret>>(rawObject, "secrets")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineReposDependabotSecretsGetResponse200JsonX6a1075a7(
        secrets = secrets,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposDependabotSecretsGetResponse200JsonX6a1075a7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposDependabotSecretsGetResponse200JsonX6a1075a7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("secrets", json.encodeToJsonElement(value.secrets))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposDependabotSecretsGetResponse200JsonX6a1075a7(block: InlineReposDependabotSecretsGetResponse200JsonX6a1075a7.Builder.() -> Unit): InlineReposDependabotSecretsGetResponse200JsonX6a1075a7 = InlineReposDependabotSecretsGetResponse200JsonX6a1075a7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposDependabotSecretsGetResponse200JsonX6a1075a7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
