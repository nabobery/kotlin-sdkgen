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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1dependabot~1secrets/get/responses/200/content/application~1json/sc
 * hema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1dependabot~1secrets/get/responses/200/content/application~1json/sc
 * hema
 */
@Serializable(with = InlineOrgsDependabotSecretsGetResponse200JsonX53aab923.Serializer::class)
public class InlineOrgsDependabotSecretsGetResponse200JsonX53aab923(
  secrets: List<OrganizationDependabotSecret>,
  public val totalCount: Int,
) {
  public val secrets: List<OrganizationDependabotSecret> = secrets.toList()

  public class Builder {
    private var secretsValue: List<OrganizationDependabotSecret>? = null

    public var secrets: List<OrganizationDependabotSecret>
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

    public fun build(): InlineOrgsDependabotSecretsGetResponse200JsonX53aab923 {
      check(secretsValue != null) { "secrets is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsDependabotSecretsGetResponse200JsonX53aab923(
        secrets = secrets,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsDependabotSecretsGetResponse200JsonX53aab923 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsDependabotSecretsGetResponse200JsonX53aab923> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsDependabotSecretsGetResponse200JsonX53aab923 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsDependabotSecretsGetResponse200JsonX53aab923")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsDependabotSecretsGetResponse200JsonX53aab923 must be a JSON object")
      val secrets = json.decodeRequired<List<OrganizationDependabotSecret>>(rawObject, "secrets")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsDependabotSecretsGetResponse200JsonX53aab923(
        secrets = secrets,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsDependabotSecretsGetResponse200JsonX53aab923) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsDependabotSecretsGetResponse200JsonX53aab923")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("secrets", json.encodeToJsonElement(value.secrets))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsDependabotSecretsGetResponse200JsonX53aab923(block: InlineOrgsDependabotSecretsGetResponse200JsonX53aab923.Builder.() -> Unit): InlineOrgsDependabotSecretsGetResponse200JsonX53aab923 = InlineOrgsDependabotSecretsGetResponse200JsonX53aab923.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsDependabotSecretsGetResponse200JsonX53aab923 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
