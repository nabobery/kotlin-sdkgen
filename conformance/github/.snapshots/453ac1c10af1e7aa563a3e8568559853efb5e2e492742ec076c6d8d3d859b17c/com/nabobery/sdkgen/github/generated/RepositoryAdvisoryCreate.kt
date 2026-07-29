package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/repository-advisory-create.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-advisory-create
 */
@Serializable(with = RepositoryAdvisoryCreate.Serializer::class)
public class RepositoryAdvisoryCreate(
  /**
   * A detailed description of what the advisory impacts.
   */
  public val description: String,
  /**
   * A short summary of the advisory.
   */
  public val summary: String,
  vulnerabilities: List<InlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c>,
  credits: List<InlineRepositoryAdvisoryCreateCreditsItemX0ce36d18>? = null,
  /**
   * The Common Vulnerabilities and Exposures (CVE) ID.
   */
  public val cveId: String? = null,
  /**
   * The CVSS vector that calculates the severity of the advisory. You must choose between setting this field or
   * `severity`.
   */
  public val cvssVectorString: String? = null,
  cweIds: List<String>? = null,
  /**
   * The severity of the advisory. You must choose between setting this field or `cvss_vector_string`.
   */
  public val severity: InlineRepositoryAdvisoryCreateSeverityX26417479? = null,
  /**
   * Whether to create a temporary private fork of the repository to collaborate on a fix.
   */
  public val startPrivateFork: Boolean? = null,
) {
  /**
   * A product affected by the vulnerability detailed in a repository security advisory.
   */
  public val vulnerabilities: List<InlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c> =
      vulnerabilities.toList()

  /**
   * A list of users receiving credit for their participation in the security advisory.
   */
  public val credits: List<InlineRepositoryAdvisoryCreateCreditsItemX0ce36d18>? =
      credits?.let { collection0 -> collection0.toList() }

  /**
   * A list of Common Weakness Enumeration (CWE) IDs.
   */
  public val cweIds: List<String>? = cweIds?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var descriptionValue: String? = null

    public var description: String
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
      }

    private var summaryValue: String? = null

    public var summary: String
      get() = requireNotNull(summaryValue) { "summary is required" }
      set(`value`) {
        summaryValue = value
      }

    private var vulnerabilitiesValue:
        List<InlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c>? = null

    public var vulnerabilities: List<InlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c>
      get() = requireNotNull(vulnerabilitiesValue) { "vulnerabilities is required" }.toList()
      set(`value`) {
        vulnerabilitiesValue = value.toList()
      }

    private var creditsValue: List<InlineRepositoryAdvisoryCreateCreditsItemX0ce36d18>? = null

    /**
     * A list of users receiving credit for their participation in the security advisory.
     */
    public var credits: List<InlineRepositoryAdvisoryCreateCreditsItemX0ce36d18>?
      get() = creditsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        creditsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The Common Vulnerabilities and Exposures (CVE) ID.
     */
    public var cveId: String? = null

    /**
     * The CVSS vector that calculates the severity of the advisory. You must choose between setting this field or
     * `severity`.
     */
    public var cvssVectorString: String? = null

    private var cweIdsValue: List<String>? = null

    /**
     * A list of Common Weakness Enumeration (CWE) IDs.
     */
    public var cweIds: List<String>?
      get() = cweIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        cweIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The severity of the advisory. You must choose between setting this field or `cvss_vector_string`.
     */
    public var severity: InlineRepositoryAdvisoryCreateSeverityX26417479? = null

    /**
     * Whether to create a temporary private fork of the repository to collaborate on a fix.
     */
    public var startPrivateFork: Boolean? = null

    public fun build(): RepositoryAdvisoryCreate {
      check(descriptionValue != null) { "description is required" }
      check(summaryValue != null) { "summary is required" }
      check(vulnerabilitiesValue != null) { "vulnerabilities is required" }
      return RepositoryAdvisoryCreate(
        description = description,
        summary = summary,
        vulnerabilities = vulnerabilities,
        credits = credits,
        cveId = cveId,
        cvssVectorString = cvssVectorString,
        cweIds = cweIds,
        severity = severity,
        startPrivateFork = startPrivateFork,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryAdvisoryCreate = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RepositoryAdvisoryCreate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryAdvisoryCreate {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryAdvisoryCreate")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryAdvisoryCreate must be a JSON object")
      val description = json.decodeRequired<String>(rawObject, "description")
      val summary = json.decodeRequired<String>(rawObject, "summary")
      val vulnerabilities = json.decodeRequired<List<InlineRepositoryAdvisoryCreateVulnerabilitiesItemX14046d0c>>(rawObject, "vulnerabilities")
      return RepositoryAdvisoryCreate(
        description = description,
        summary = summary,
        vulnerabilities = vulnerabilities,
        credits = rawObject["credits"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineRepositoryAdvisoryCreateCreditsItemX0ce36d18>?>(element) },
        cveId = rawObject["cve_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        cvssVectorString = rawObject["cvss_vector_string"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        cweIds = rawObject["cwe_ids"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        severity = rawObject["severity"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineRepositoryAdvisoryCreateSeverityX26417479?>(element) },
        startPrivateFork = rawObject["start_private_fork"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryAdvisoryCreate) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryAdvisoryCreate")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("description", value.description)
        put("summary", value.summary)
        put("vulnerabilities", json.encodeToJsonElement(value.vulnerabilities))
        value.credits?.let { put("credits", json.encodeToJsonElement(it)) }
        value.cveId?.let { put("cve_id", it) }
        value.cvssVectorString?.let { put("cvss_vector_string", it) }
        value.cweIds?.let { put("cwe_ids", json.encodeToJsonElement(it)) }
        value.severity?.let { put("severity", json.encodeToJsonElement(it)) }
        value.startPrivateFork?.let { put("start_private_fork", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryAdvisoryCreate(block: RepositoryAdvisoryCreate.Builder.() -> Unit): RepositoryAdvisoryCreate = RepositoryAdvisoryCreate.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryAdvisoryCreate is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
