package io.github.nabobery.sdkgen.github.generated

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
 * The details of the security advisory, including summary, description, and severity.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_security_advisory
 */
@Serializable(with = WebhooksSecurityAdvisory.Serializer::class)
public class WebhooksSecurityAdvisory internal constructor(
  public val cvss: InlineWebhooksSecurityAdvisoryCvssX3229876d,
  cwes: List<InlineWebhooksSecurityAdvisoryCwesItemX7071aa94>,
  public val description: String,
  public val ghsaId: String,
  identifiers: List<InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f>,
  public val publishedAt: String,
  references: List<InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd>,
  public val severity: String,
  public val summary: String,
  public val updatedAt: String,
  vulnerabilities: List<InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7>,
  public val withdrawnAt: String?,
  private val cvssSeveritiesState: FieldState<CvssSeverities?>,
) {
  public val cwes: List<InlineWebhooksSecurityAdvisoryCwesItemX7071aa94> = cwes.toList()

  public val identifiers: List<InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f> =
      identifiers.toList()

  public val references: List<InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd> =
      references.toList()

  public val vulnerabilities: List<InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7> =
      vulnerabilities.toList()

  public val cvssSeverities: CvssSeverities?
    get() = cvssSeveritiesState.valueOrNull()

  public constructor(
    cvss: InlineWebhooksSecurityAdvisoryCvssX3229876d,
    cwes: List<InlineWebhooksSecurityAdvisoryCwesItemX7071aa94>,
    description: String,
    ghsaId: String,
    identifiers: List<InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f>,
    publishedAt: String,
    references: List<InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd>,
    severity: String,
    summary: String,
    updatedAt: String,
    vulnerabilities: List<InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7>,
    withdrawnAt: String?,
  ) : this(cvss = cvss,
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
  cvssSeveritiesState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `cvss_severities`.
   */
  public fun cvssSeveritiesPresence(): FieldPresence = cvssSeveritiesState.presence

  public class Builder {
    private var cvssValue: InlineWebhooksSecurityAdvisoryCvssX3229876d? = null

    public var cvss: InlineWebhooksSecurityAdvisoryCvssX3229876d
      get() = requireNotNull(cvssValue) { "cvss is required" }
      set(`value`) {
        cvssValue = value
      }

    private var cwesValue: List<InlineWebhooksSecurityAdvisoryCwesItemX7071aa94>? = null

    public var cwes: List<InlineWebhooksSecurityAdvisoryCwesItemX7071aa94>
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

    private var identifiersValue: List<InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f>? =
        null

    public var identifiers: List<InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f>
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

    private var referencesValue: List<InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd>? = null

    public var references: List<InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd>
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
        List<InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7>? = null

    public var vulnerabilities: List<InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7>
      get() = requireNotNull(vulnerabilitiesValue) { "vulnerabilities is required" }.toList()
      set(`value`) {
        vulnerabilitiesValue = value.toList()
      }

    private var withdrawnAtState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var withdrawnAt: String?
      get() = withdrawnAtState.valueOrNull()
      set(`value`) {
        withdrawnAtState = value.toNullableFieldState()
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

    /**
     * Omits `cvss_severities` from serialized output.
     */
    public fun unsetCvssSeverities() {
      cvssSeveritiesState = FieldState.Absent
    }

    public fun build(): WebhooksSecurityAdvisory {
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
      check(withdrawnAtState !== FieldState.Absent) { "withdrawnAt is required, even when null" }
      return WebhooksSecurityAdvisory(
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
        cvssSeveritiesState = cvssSeveritiesState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhooksSecurityAdvisory = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhooksSecurityAdvisory> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhooksSecurityAdvisory {
      val jsonDecoder = decoder.requireJsonDecoder("WebhooksSecurityAdvisory")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhooksSecurityAdvisory must be a JSON object")
      val cvss = json.decodeRequired<InlineWebhooksSecurityAdvisoryCvssX3229876d>(rawObject, "cvss")
      val cwes = json.decodeRequired<List<InlineWebhooksSecurityAdvisoryCwesItemX7071aa94>>(rawObject, "cwes")
      val description = json.decodeRequired<String>(rawObject, "description")
      val ghsaId = json.decodeRequired<String>(rawObject, "ghsa_id")
      val identifiers = json.decodeRequired<List<InlineWebhooksSecurityAdvisoryIdentifiersItemX8e1e618f>>(rawObject, "identifiers")
      val publishedAt = json.decodeRequired<String>(rawObject, "published_at")
      val references = json.decodeRequired<List<InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd>>(rawObject, "references")
      val severity = json.decodeRequired<String>(rawObject, "severity")
      val summary = json.decodeRequired<String>(rawObject, "summary")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val vulnerabilities = json.decodeRequired<List<InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7>>(rawObject, "vulnerabilities")
      if (!rawObject.containsKey("withdrawn_at")) {
        throw SerializationException("WebhooksSecurityAdvisory is missing required property 'withdrawn_at'")
      }
      val withdrawnAt = rawObject["withdrawn_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return WebhooksSecurityAdvisory(
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
        cvssSeveritiesState = json.decodeOptional(rawObject, "cvss_severities", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhooksSecurityAdvisory) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhooksSecurityAdvisory")
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
        put("withdrawn_at", value.withdrawnAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("cvss_severities", value.cvssSeveritiesState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhooksSecurityAdvisory(block: WebhooksSecurityAdvisory.Builder.() -> Unit): WebhooksSecurityAdvisory = WebhooksSecurityAdvisory.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhooksSecurityAdvisory is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("WebhooksSecurityAdvisory property '" + name + "' is not nullable")
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
