package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The name of the package affected by the vulnerability.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/repository-advisory-create/properties/vulnerabilities/items/properti
 * es/package
 */
@Serializable(with = InlineRepositoryAdvisoryCreateVulnerabilitiesItemPackageValueXa8a2f54a.Serializer::class)
public class InlineRepositoryAdvisoryCreateVulnerabilitiesItemPackageValueXa8a2f54a(
  public val ecosystem: SecurityAdvisoryEcosystems,
  /**
   * The unique package name within its ecosystem.
   */
  public val name: String? = null,
) {
  public class Builder {
    private var ecosystemValue: SecurityAdvisoryEcosystems? = null

    public var ecosystem: SecurityAdvisoryEcosystems
      get() = requireNotNull(ecosystemValue) { "ecosystem is required" }
      set(`value`) {
        ecosystemValue = value
      }

    /**
     * The unique package name within its ecosystem.
     */
    public var name: String? = null

    public fun build(): InlineRepositoryAdvisoryCreateVulnerabilitiesItemPackageValueXa8a2f54a {
      check(ecosystemValue != null) { "ecosystem is required" }
      return InlineRepositoryAdvisoryCreateVulnerabilitiesItemPackageValueXa8a2f54a(
        ecosystem = ecosystem,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryAdvisoryCreateVulnerabilitiesItemPackageValueXa8a2f54a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRepositoryAdvisoryCreateVulnerabilitiesItemPackageValueXa8a2f54a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryAdvisoryCreateVulnerabilitiesItemPackageValueXa8a2f54a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryAdvisoryCreateVulnerabilitiesItemPackageValueXa8a2f54a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryAdvisoryCreateVulnerabilitiesItemPackageValueXa8a2f54a must be a JSON object")
      val ecosystem = json.decodeRequired<SecurityAdvisoryEcosystems>(rawObject, "ecosystem")
      return InlineRepositoryAdvisoryCreateVulnerabilitiesItemPackageValueXa8a2f54a(
        ecosystem = ecosystem,
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryAdvisoryCreateVulnerabilitiesItemPackageValueXa8a2f54a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryAdvisoryCreateVulnerabilitiesItemPackageValueXa8a2f54a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("ecosystem", json.encodeToJsonElement(value.ecosystem))
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryAdvisoryCreateVulnerabilitiesItemPackageValueXa8a2f54a(block: InlineRepositoryAdvisoryCreateVulnerabilitiesItemPackageValueXa8a2f54a.Builder.() -> Unit): InlineRepositoryAdvisoryCreateVulnerabilitiesItemPackageValueXa8a2f54a = InlineRepositoryAdvisoryCreateVulnerabilitiesItemPackageValueXa8a2f54a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryAdvisoryCreateVulnerabilitiesItemPackageValueXa8a2f54a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
