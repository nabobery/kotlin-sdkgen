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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Details for the GitHub Security Advisory.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependabot-alert-security-advisory
 */
@Serializable(with = DependabotAlertSecurityAdvisory.Serializer::class)
public class DependabotAlertSecurityAdvisory internal constructor(
  /**
   * The unique CVE ID assigned to the advisory.
   */
  public val cveId: String?,
  /**
   * Details for the advisory pertaining to the Common Vulnerability Scoring System.
   */
  public val cvss: InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c,
  cwes: List<InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1>,
  /**
   * A long-form Markdown-supported description of the advisory.
   */
  public val description: String,
  /**
   * The unique GitHub Security Advisory ID assigned to the advisory.
   */
  public val ghsaId: String,
  identifiers: List<InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688>,
  /**
   * The time that the advisory was published in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val publishedAt: String,
  references: List<InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3>,
  /**
   * The severity of the advisory.
   */
  public val severity: InlineDependabotAlertSecurityAdvisorySeverityX9b56c3b0,
  /**
   * A short, plain text summary of the advisory.
   */
  public val summary: String,
  /**
   * The time that the advisory was last modified in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  vulnerabilities: List<DependabotAlertSecurityVulnerability>,
  /**
   * The time that the advisory was withdrawn in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val withdrawnAt: String?,
  private val classificationState:
      FieldState<InlineDependabotAlertSecurityAdvisoryClassificationXbcf486e5>,
  private val cvssSeveritiesState: FieldState<CvssSeverities?>,
  private val epssState: FieldState<SecurityAdvisoryEpss?>,
) {
  /**
   * Details for the advisory pertaining to Common Weakness Enumeration.
   */
  public val cwes: List<InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1> = cwes.toList()

  /**
   * Values that identify this advisory among security information sources.
   */
  public val identifiers: List<InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688> =
      identifiers.toList()

  /**
   * Links to additional advisory information.
   */
  public val references: List<InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3> =
      references.toList()

  /**
   * Vulnerable version range information for the advisory.
   */
  public val vulnerabilities: List<DependabotAlertSecurityVulnerability> = vulnerabilities.toList()

  /**
   * The classification of the advisory.
   */
  public val classification: InlineDependabotAlertSecurityAdvisoryClassificationXbcf486e5?
    get() = classificationState.valueOrNull()

  public val cvssSeverities: CvssSeverities?
    get() = cvssSeveritiesState.valueOrNull()

  public val epss: SecurityAdvisoryEpss?
    get() = epssState.valueOrNull()

  public constructor(
    cveId: String?,
    cvss: InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c,
    cwes: List<InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1>,
    description: String,
    ghsaId: String,
    identifiers: List<InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688>,
    publishedAt: String,
    references: List<InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3>,
    severity: InlineDependabotAlertSecurityAdvisorySeverityX9b56c3b0,
    summary: String,
    updatedAt: String,
    vulnerabilities: List<DependabotAlertSecurityVulnerability>,
    withdrawnAt: String?,
  ) : this(cveId = cveId,
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
  classificationState = FieldState.Absent,
  cvssSeveritiesState = FieldState.Absent,
  epssState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `classification`.
   */
  public fun classificationPresence(): FieldPresence = classificationState.presence

  /**
   * Returns the wire presence of `cvss_severities`.
   */
  public fun cvssSeveritiesPresence(): FieldPresence = cvssSeveritiesState.presence

  /**
   * Returns the wire presence of `epss`.
   */
  public fun epssPresence(): FieldPresence = epssState.presence

  public class Builder {
    private var cvssValue: InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c? = null

    public var cvss: InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c
      get() = requireNotNull(cvssValue) { "cvss is required" }
      set(`value`) {
        cvssValue = value
      }

    private var cwesValue: List<InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1>? = null

    public var cwes: List<InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1>
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
        List<InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688>? = null

    public var identifiers: List<InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688>
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

    private var referencesValue: List<InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3>?
        = null

    public var references: List<InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3>
      get() = requireNotNull(referencesValue) { "references is required" }.toList()
      set(`value`) {
        referencesValue = value.toList()
      }

    private var severityValue: InlineDependabotAlertSecurityAdvisorySeverityX9b56c3b0? = null

    public var severity: InlineDependabotAlertSecurityAdvisorySeverityX9b56c3b0
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

    private var vulnerabilitiesValue: List<DependabotAlertSecurityVulnerability>? = null

    public var vulnerabilities: List<DependabotAlertSecurityVulnerability>
      get() = requireNotNull(vulnerabilitiesValue) { "vulnerabilities is required" }.toList()
      set(`value`) {
        vulnerabilitiesValue = value.toList()
      }

    private var cveIdState: FieldState<String?> = FieldState.Absent

    /**
     * The unique CVE ID assigned to the advisory.
     * Required nullable field; assigning `null` records present-null.
     */
    public var cveId: String?
      get() = cveIdState.valueOrNull()
      set(`value`) {
        cveIdState = value.toNullableFieldState()
      }

    private var withdrawnAtState: FieldState<String?> = FieldState.Absent

    /**
     * The time that the advisory was withdrawn in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var withdrawnAt: String?
      get() = withdrawnAtState.valueOrNull()
      set(`value`) {
        withdrawnAtState = value.toNullableFieldState()
      }

    private var classificationState:
        FieldState<InlineDependabotAlertSecurityAdvisoryClassificationXbcf486e5> = FieldState.Absent

    /**
     * The classification of the advisory.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var classification: InlineDependabotAlertSecurityAdvisoryClassificationXbcf486e5?
      get() = classificationState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "classification is not nullable; call unsetClassification() to omit it" }
        classificationState = FieldState.Value(present)
      }

    private var cvssSeveritiesState: FieldState<CvssSeverities?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var cvssSeverities: CvssSeverities?
      get() = cvssSeveritiesState.valueOrNull()
      set(`value`) {
        cvssSeveritiesState = value.toNullableFieldState()
      }

    private var epssState: FieldState<SecurityAdvisoryEpss?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var epss: SecurityAdvisoryEpss?
      get() = epssState.valueOrNull()
      set(`value`) {
        epssState = value.toNullableFieldState()
      }

    /**
     * Omits `classification` from serialized output.
     */
    public fun unsetClassification() {
      classificationState = FieldState.Absent
    }

    /**
     * Omits `cvss_severities` from serialized output.
     */
    public fun unsetCvssSeverities() {
      cvssSeveritiesState = FieldState.Absent
    }

    /**
     * Omits `epss` from serialized output.
     */
    public fun unsetEpss() {
      epssState = FieldState.Absent
    }

    public fun build(): DependabotAlertSecurityAdvisory {
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
      check(cveIdState !== FieldState.Absent) { "cveId is required, even when null" }
      check(withdrawnAtState !== FieldState.Absent) { "withdrawnAt is required, even when null" }
      return DependabotAlertSecurityAdvisory(
        cveId = cveIdState.valueOrNull(),
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
        withdrawnAt = withdrawnAtState.valueOrNull(),
        classificationState = classificationState,
        cvssSeveritiesState = cvssSeveritiesState,
        epssState = epssState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DependabotAlertSecurityAdvisory = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DependabotAlertSecurityAdvisory> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DependabotAlertSecurityAdvisory {
      val jsonDecoder = decoder.requireJsonDecoder("DependabotAlertSecurityAdvisory")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DependabotAlertSecurityAdvisory must be a JSON object")
      val cvss = json.decodeRequired<InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c>(rawObject, "cvss")
      val cwes = json.decodeRequired<List<InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1>>(rawObject, "cwes")
      val description = json.decodeRequired<String>(rawObject, "description")
      val ghsaId = json.decodeRequired<String>(rawObject, "ghsa_id")
      val identifiers = json.decodeRequired<List<InlineDependabotAlertSecurityAdvisoryIdentifiersItemXa5b14688>>(rawObject, "identifiers")
      val publishedAt = json.decodeRequired<String>(rawObject, "published_at")
      val references = json.decodeRequired<List<InlineDependabotAlertSecurityAdvisoryReferencesItemXfaf5e7b3>>(rawObject, "references")
      val severity = json.decodeRequired<InlineDependabotAlertSecurityAdvisorySeverityX9b56c3b0>(rawObject, "severity")
      val summary = json.decodeRequired<String>(rawObject, "summary")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val vulnerabilities = json.decodeRequired<List<DependabotAlertSecurityVulnerability>>(rawObject, "vulnerabilities")
      if (!rawObject.containsKey("cve_id")) {
        throw SerializationException("DependabotAlertSecurityAdvisory is missing required property 'cve_id'")
      }
      val cveId = rawObject["cve_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("withdrawn_at")) {
        throw SerializationException("DependabotAlertSecurityAdvisory is missing required property 'withdrawn_at'")
      }
      val withdrawnAt = rawObject["withdrawn_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return DependabotAlertSecurityAdvisory(
        cveId = cveId,
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
        classificationState = json.decodeOptional(rawObject, "classification", nullable = false),
        cvssSeveritiesState = json.decodeOptional(rawObject, "cvss_severities", nullable = true),
        epssState = json.decodeOptional(rawObject, "epss", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: DependabotAlertSecurityAdvisory) {
      val jsonEncoder = encoder.requireJsonEncoder("DependabotAlertSecurityAdvisory")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cve_id", value.cveId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("cvss", json.encodeToJsonElement(value.cvss))
        put("cwes", json.encodeToJsonElement(value.cwes))
        put("description", value.description)
        put("ghsa_id", value.ghsaId)
        put("identifiers", json.encodeToJsonElement(value.identifiers))
        put("published_at", value.publishedAt)
        put("references", json.encodeToJsonElement(value.references))
        put("severity", json.encodeToJsonElement(value.severity))
        put("summary", value.summary)
        put("updated_at", value.updatedAt)
        put("vulnerabilities", json.encodeToJsonElement(value.vulnerabilities))
        put("withdrawn_at", value.withdrawnAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("classification", value.classificationState, json::encodeToJsonElement)
        putState("cvss_severities", value.cvssSeveritiesState, json::encodeToJsonElement)
        putState("epss", value.epssState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun dependabotAlertSecurityAdvisory(block: DependabotAlertSecurityAdvisory.Builder.() -> Unit): DependabotAlertSecurityAdvisory = DependabotAlertSecurityAdvisory.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DependabotAlertSecurityAdvisory is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("DependabotAlertSecurityAdvisory property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
