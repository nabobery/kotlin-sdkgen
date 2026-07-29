package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/repository-advisory-create/properties/vulnerabilities/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-advisory-create/properties/vulnerabilities/items
 */
@Serializable(with = InlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c.Serializer::class)
public class InlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c(
  /**
   * The name of the package affected by the vulnerability.
   */
  public val packageValue: InlineRepositoryAdvisoryCreateVulnerabilitiesItemPackageValueXa8a2f54a,
  /**
   * The package version(s) that resolve the vulnerability.
   */
  public val patchedVersions: String? = null,
  vulnerableFunctions: List<String>? = null,
  /**
   * The range of the package versions affected by the vulnerability.
   */
  public val vulnerableVersionRange: String? = null,
) {
  /**
   * The functions in the package that are affected.
   */
  public val vulnerableFunctions: List<String>? =
      vulnerableFunctions?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var packageValueValue:
        InlineRepositoryAdvisoryCreateVulnerabilitiesItemPackageValueXa8a2f54a? = null

    public var packageValue: InlineRepositoryAdvisoryCreateVulnerabilitiesItemPackageValueXa8a2f54a
      get() = requireNotNull(packageValueValue) { "packageValue is required" }
      set(`value`) {
        packageValueValue = value
      }

    /**
     * The package version(s) that resolve the vulnerability.
     */
    public var patchedVersions: String? = null

    private var vulnerableFunctionsValue: List<String>? = null

    /**
     * The functions in the package that are affected.
     */
    public var vulnerableFunctions: List<String>?
      get() = vulnerableFunctionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        vulnerableFunctionsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The range of the package versions affected by the vulnerability.
     */
    public var vulnerableVersionRange: String? = null

    public fun build(): InlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c {
      check(packageValueValue != null) { "packageValue is required" }
      return InlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c(
        packageValue = packageValue,
        patchedVersions = patchedVersions,
        vulnerableFunctions = vulnerableFunctions,
        vulnerableVersionRange = vulnerableVersionRange,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c must be a JSON object")
      val packageValue = json.decodeRequired<InlineRepositoryAdvisoryCreateVulnerabilitiesItemPackageValueXa8a2f54a>(rawObject, "package")
      return InlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c(
        packageValue = packageValue,
        patchedVersions = rawObject["patched_versions"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        vulnerableFunctions = rawObject["vulnerable_functions"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        vulnerableVersionRange = rawObject["vulnerable_version_range"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("package", json.encodeToJsonElement(value.packageValue))
        value.patchedVersions?.let { put("patched_versions", it) }
        value.vulnerableFunctions?.let { put("vulnerable_functions", json.encodeToJsonElement(it)) }
        value.vulnerableVersionRange?.let { put("vulnerable_version_range", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c(block: InlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c.Builder.() -> Unit): InlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c = InlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
