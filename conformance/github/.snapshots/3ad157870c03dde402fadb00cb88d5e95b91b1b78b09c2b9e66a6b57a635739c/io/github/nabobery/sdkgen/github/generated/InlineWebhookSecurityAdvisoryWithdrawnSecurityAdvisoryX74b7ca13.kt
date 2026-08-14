package io.github.nabobery.sdkgen.github.generated

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
 * The details of the security advisory, including summary, description, and severity.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-security-advisory-withdrawn/properties/security_advisory
 */
@Serializable(with = InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryX74b7ca13.Serializer::class)
public class InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryX74b7ca13(
  public val cvss: InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea,
  cwes: List<InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCwesItemX23063791>,
  public val description: String,
  public val ghsaId: String,
  identifiers: List<InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a>,
  public val publishedAt: String,
  references: List<InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryReferencesItemXf9bffba8>,
  public val severity: String,
  public val summary: String,
  public val updatedAt: String,
  vulnerabilities: List<InlineWebhookSecurityAdvis6020SecurityAdvisoryVulnerabilitiesItemXb4ebfb43>,
  public val withdrawnAt: String,
  public val cvssSeverities: CvssSeverities? = null,
) {
  public val cwes: List<InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCwesItemX23063791> =
      cwes.toList()

  public val identifiers:
      List<InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a> =
      identifiers.toList()

  public val references:
      List<InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryReferencesItemXf9bffba8> =
      references.toList()

  public val vulnerabilities:
      List<InlineWebhookSecurityAdvis6020SecurityAdvisoryVulnerabilitiesItemXb4ebfb43> =
      vulnerabilities.toList()

  public class Builder {
    private var cvssValue: InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea? =
        null

    public var cvss: InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea
      get() = requireNotNull(cvssValue) { "cvss is required" }
      set(`value`) {
        cvssValue = value
      }

    private var cwesValue:
        List<InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCwesItemX23063791>? = null

    public var cwes: List<InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCwesItemX23063791>
      get() = requireNotNull(cwesValue) { "cwes is required" }.toList()
      set(`value`) {
        cwesValue = value.toList()
      }

    private var descriptionValue: String? = null

    public var description: String
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
      }

    private var ghsaIdValue: String? = null

    public var ghsaId: String
      get() = requireNotNull(ghsaIdValue) { "ghsaId is required" }
      set(`value`) {
        ghsaIdValue = value
      }

    private var identifiersValue:
        List<InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a>? = null

    public var identifiers:
        List<InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a>
      get() = requireNotNull(identifiersValue) { "identifiers is required" }.toList()
      set(`value`) {
        identifiersValue = value.toList()
      }

    private var publishedAtValue: String? = null

    public var publishedAt: String
      get() = requireNotNull(publishedAtValue) { "publishedAt is required" }
      set(`value`) {
        publishedAtValue = value
      }

    private var referencesValue:
        List<InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryReferencesItemXf9bffba8>? = null

    public var references:
        List<InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryReferencesItemXf9bffba8>
      get() = requireNotNull(referencesValue) { "references is required" }.toList()
      set(`value`) {
        referencesValue = value.toList()
      }

    private var severityValue: String? = null

    public var severity: String
      get() = requireNotNull(severityValue) { "severity is required" }
      set(`value`) {
        severityValue = value
      }

    private var summaryValue: String? = null

    public var summary: String
      get() = requireNotNull(summaryValue) { "summary is required" }
      set(`value`) {
        summaryValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var vulnerabilitiesValue:
        List<InlineWebhookSecurityAdvis6020SecurityAdvisoryVulnerabilitiesItemXb4ebfb43>? = null

    public var vulnerabilities:
        List<InlineWebhookSecurityAdvis6020SecurityAdvisoryVulnerabilitiesItemXb4ebfb43>
      get() = requireNotNull(vulnerabilitiesValue) { "vulnerabilities is required" }.toList()
      set(`value`) {
        vulnerabilitiesValue = value.toList()
      }

    private var withdrawnAtValue: String? = null

    public var withdrawnAt: String
      get() = requireNotNull(withdrawnAtValue) { "withdrawnAt is required" }
      set(`value`) {
        withdrawnAtValue = value
      }

    public var cvssSeverities: CvssSeverities? = null

    public fun build(): InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryX74b7ca13 {
      check(cvssValue != null) { "cvss is required" }
      check(cwesValue != null) { "cwes is required" }
      check(descriptionValue != null) { "description is required" }
      check(ghsaIdValue != null) { "ghsaId is required" }
      check(identifiersValue != null) { "identifiers is required" }
      check(publishedAtValue != null) { "publishedAt is required" }
      check(referencesValue != null) { "references is required" }
      check(severityValue != null) { "severity is required" }
      check(summaryValue != null) { "summary is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(vulnerabilitiesValue != null) { "vulnerabilities is required" }
      check(withdrawnAtValue != null) { "withdrawnAt is required" }
      return InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryX74b7ca13(
        cvss = cvss,
        cwes = cwes,
        description = description,
        ghsaId = ghsaId,
        identifiers = identifiers,
        publishedAt = publishedAt,
        references = references,
        severity = severity,
        summary = summary,
        updatedAt = updatedAt,
        vulnerabilities = vulnerabilities,
        withdrawnAt = withdrawnAt,
        cvssSeverities = cvssSeverities,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryX74b7ca13 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryX74b7ca13> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryX74b7ca13 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryX74b7ca13")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryX74b7ca13 must be a JSON object")
      val cvss = json.decodeRequired<InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCvssXee0a45ea>(rawObject, "cvss")
      val cwes = json.decodeRequired<List<InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCwesItemX23063791>>(rawObject, "cwes")
      val description = json.decodeRequired<String>(rawObject, "description")
      val ghsaId = json.decodeRequired<String>(rawObject, "ghsa_id")
      val identifiers = json.decodeRequired<List<InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryIdentifiersItemX7e4a014a>>(rawObject, "identifiers")
      val publishedAt = json.decodeRequired<String>(rawObject, "published_at")
      val references = json.decodeRequired<List<InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryReferencesItemXf9bffba8>>(rawObject, "references")
      val severity = json.decodeRequired<String>(rawObject, "severity")
      val summary = json.decodeRequired<String>(rawObject, "summary")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val vulnerabilities = json.decodeRequired<List<InlineWebhookSecurityAdvis6020SecurityAdvisoryVulnerabilitiesItemXb4ebfb43>>(rawObject, "vulnerabilities")
      val withdrawnAt = json.decodeRequired<String>(rawObject, "withdrawn_at")
      return InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryX74b7ca13(
        cvss = cvss,
        cwes = cwes,
        description = description,
        ghsaId = ghsaId,
        identifiers = identifiers,
        publishedAt = publishedAt,
        references = references,
        severity = severity,
        summary = summary,
        updatedAt = updatedAt,
        vulnerabilities = vulnerabilities,
        withdrawnAt = withdrawnAt,
        cvssSeverities = rawObject["cvss_severities"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<CvssSeverities?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryX74b7ca13) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryX74b7ca13")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cvss", json.encodeToJsonElement(value.cvss))
        put("cwes", json.encodeToJsonElement(value.cwes))
        put("description", value.description)
        put("ghsa_id", value.ghsaId)
        put("identifiers", json.encodeToJsonElement(value.identifiers))
        put("published_at", value.publishedAt)
        put("references", json.encodeToJsonElement(value.references))
        put("severity", value.severity)
        put("summary", value.summary)
        put("updated_at", value.updatedAt)
        put("vulnerabilities", json.encodeToJsonElement(value.vulnerabilities))
        put("withdrawn_at", value.withdrawnAt)
        value.cvssSeverities?.let { put("cvss_severities", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryX74b7ca13(block: InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryX74b7ca13.Builder.() -> Unit): InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryX74b7ca13 = InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryX74b7ca13.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryX74b7ca13 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
