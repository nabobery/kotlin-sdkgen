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
 * A GitHub Security Advisory.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/global-advisory
 */
@Serializable(with = GlobalAdvisory.Serializer::class)
public class GlobalAdvisory internal constructor(
  /**
   * The users who contributed to the advisory.
   */
  public val credits: List<InlineGlobalAdvisoryCreditsItemXcbb55886>?,
  /**
   * The Common Vulnerabilities and Exposures (CVE) ID.
   */
  public val cveId: String?,
  public val cvss: InlineGlobalAdvisoryCvssX74f75226?,
  public val cwes: List<InlineGlobalAdvisoryCwesItemX1a9e04b8>?,
  /**
   * A detailed description of what the advisory entails.
   */
  public val description: String?,
  /**
   * The GitHub Security Advisory ID.
   */
  public val ghsaId: String,
  /**
   * The date and time of when the advisory was reviewed by GitHub, in ISO 8601 format.
   */
  public val githubReviewedAt: String?,
  /**
   * The URL for the advisory.
   */
  public val htmlUrl: String,
  public val identifiers: List<InlineGlobalAdvisoryIdentifiersItemXa24e0c60>?,
  /**
   * The date and time when the advisory was published in the National Vulnerability Database, in ISO 8601 format.
   * This field is only populated when the advisory is imported from the National Vulnerability Database.
   */
  public val nvdPublishedAt: String?,
  /**
   * The date and time of when the advisory was published, in ISO 8601 format.
   */
  public val publishedAt: String,
  public val references: List<String>?,
  /**
   * The API URL for the repository advisory.
   */
  public val repositoryAdvisoryUrl: String?,
  /**
   * The severity of the advisory.
   */
  public val severity: InlineGlobalAdvisorySeverityXc542f37a,
  /**
   * The URL of the advisory's source code.
   */
  public val sourceCodeLocation: String?,
  /**
   * A short summary of the advisory.
   */
  public val summary: String,
  /**
   * The type of advisory.
   */
  public val type: InlineGlobalAdvisoryTypeX906a5d90,
  /**
   * The date and time of when the advisory was last updated, in ISO 8601 format.
   */
  public val updatedAt: String,
  /**
   * The API URL for the advisory.
   */
  public val url: String,
  /**
   * The products and respective version ranges affected by the advisory.
   */
  public val vulnerabilities: List<Vulnerability>?,
  /**
   * The date and time of when the advisory was withdrawn, in ISO 8601 format.
   */
  public val withdrawnAt: String?,
  private val cvssSeveritiesState: FieldState<CvssSeverities?>,
  private val epssState: FieldState<SecurityAdvisoryEpss?>,
) {
  public val cvssSeverities: CvssSeverities?
    get() = cvssSeveritiesState.valueOrNull()

  public val epss: SecurityAdvisoryEpss?
    get() = epssState.valueOrNull()

  public constructor(
    credits: List<InlineGlobalAdvisoryCreditsItemXcbb55886>?,
    cveId: String?,
    cvss: InlineGlobalAdvisoryCvssX74f75226?,
    cwes: List<InlineGlobalAdvisoryCwesItemX1a9e04b8>?,
    description: String?,
    ghsaId: String,
    githubReviewedAt: String?,
    htmlUrl: String,
    identifiers: List<InlineGlobalAdvisoryIdentifiersItemXa24e0c60>?,
    nvdPublishedAt: String?,
    publishedAt: String,
    references: List<String>?,
    repositoryAdvisoryUrl: String?,
    severity: InlineGlobalAdvisorySeverityXc542f37a,
    sourceCodeLocation: String?,
    summary: String,
    type: InlineGlobalAdvisoryTypeX906a5d90,
    updatedAt: String,
    url: String,
    vulnerabilities: List<Vulnerability>?,
    withdrawnAt: String?,
  ) : this(credits = credits,
  cveId = cveId,
  cvss = cvss,
  cwes = cwes,
  description = description,
  ghsaId = ghsaId,
  githubReviewedAt = githubReviewedAt,
  htmlUrl = htmlUrl,
  identifiers = identifiers,
  nvdPublishedAt = nvdPublishedAt,
  publishedAt = publishedAt,
  references = references,
  repositoryAdvisoryUrl = repositoryAdvisoryUrl,
  severity = severity,
  sourceCodeLocation = sourceCodeLocation,
  summary = summary,
  type = type,
  updatedAt = updatedAt,
  url = url,
  vulnerabilities = vulnerabilities,
  withdrawnAt = withdrawnAt,
  cvssSeveritiesState = FieldState.Absent,
  epssState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `cvss_severities`.
   */
  public fun cvssSeveritiesPresence(): FieldPresence = cvssSeveritiesState.presence

  /**
   * Returns the wire presence of `epss`.
   */
  public fun epssPresence(): FieldPresence = epssState.presence

  public class Builder {
    private var ghsaIdValue: String? = null

    public var ghsaId: String
      get() = requireNotNull(ghsaIdValue) { "ghsaId is required" }
      set(`value`) {
        ghsaIdValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var publishedAtValue: String? = null

    public var publishedAt: String
      get() = requireNotNull(publishedAtValue) { "publishedAt is required" }
      set(`value`) {
        publishedAtValue = value
      }

    private var severityValue: InlineGlobalAdvisorySeverityXc542f37a? = null

    public var severity: InlineGlobalAdvisorySeverityXc542f37a
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

    private var typeValue: InlineGlobalAdvisoryTypeX906a5d90? = null

    public var type: InlineGlobalAdvisoryTypeX906a5d90
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var creditsState: FieldState<List<InlineGlobalAdvisoryCreditsItemXcbb55886>?> =
        FieldState.Absent

    /**
     * The users who contributed to the advisory.
     * Required nullable field; assigning `null` records present-null.
     */
    public var credits: List<InlineGlobalAdvisoryCreditsItemXcbb55886>?
      get() = creditsState.valueOrNull()
      set(`value`) {
        creditsState = value.toNullableFieldState()
      }

    private var cveIdState: FieldState<String?> = FieldState.Absent

    /**
     * The Common Vulnerabilities and Exposures (CVE) ID.
     * Required nullable field; assigning `null` records present-null.
     */
    public var cveId: String?
      get() = cveIdState.valueOrNull()
      set(`value`) {
        cveIdState = value.toNullableFieldState()
      }

    private var cvssState: FieldState<InlineGlobalAdvisoryCvssX74f75226?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var cvss: InlineGlobalAdvisoryCvssX74f75226?
      get() = cvssState.valueOrNull()
      set(`value`) {
        cvssState = value.toNullableFieldState()
      }

    private var cwesState: FieldState<List<InlineGlobalAdvisoryCwesItemX1a9e04b8>?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var cwes: List<InlineGlobalAdvisoryCwesItemX1a9e04b8>?
      get() = cwesState.valueOrNull()
      set(`value`) {
        cwesState = value.toNullableFieldState()
      }

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * A detailed description of what the advisory entails.
     * Required nullable field; assigning `null` records present-null.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var githubReviewedAtState: FieldState<String?> = FieldState.Absent

    /**
     * The date and time of when the advisory was reviewed by GitHub, in ISO 8601 format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var githubReviewedAt: String?
      get() = githubReviewedAtState.valueOrNull()
      set(`value`) {
        githubReviewedAtState = value.toNullableFieldState()
      }

    private var identifiersState: FieldState<List<InlineGlobalAdvisoryIdentifiersItemXa24e0c60>?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var identifiers: List<InlineGlobalAdvisoryIdentifiersItemXa24e0c60>?
      get() = identifiersState.valueOrNull()
      set(`value`) {
        identifiersState = value.toNullableFieldState()
      }

    private var nvdPublishedAtState: FieldState<String?> = FieldState.Absent

    /**
     * The date and time when the advisory was published in the National Vulnerability Database, in ISO 8601 format.
     * This field is only populated when the advisory is imported from the National Vulnerability Database.
     * Required nullable field; assigning `null` records present-null.
     */
    public var nvdPublishedAt: String?
      get() = nvdPublishedAtState.valueOrNull()
      set(`value`) {
        nvdPublishedAtState = value.toNullableFieldState()
      }

    private var referencesState: FieldState<List<String>?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var references: List<String>?
      get() = referencesState.valueOrNull()
      set(`value`) {
        referencesState = value.toNullableFieldState()
      }

    private var repositoryAdvisoryUrlState: FieldState<String?> = FieldState.Absent

    /**
     * The API URL for the repository advisory.
     * Required nullable field; assigning `null` records present-null.
     */
    public var repositoryAdvisoryUrl: String?
      get() = repositoryAdvisoryUrlState.valueOrNull()
      set(`value`) {
        repositoryAdvisoryUrlState = value.toNullableFieldState()
      }

    private var sourceCodeLocationState: FieldState<String?> = FieldState.Absent

    /**
     * The URL of the advisory's source code.
     * Required nullable field; assigning `null` records present-null.
     */
    public var sourceCodeLocation: String?
      get() = sourceCodeLocationState.valueOrNull()
      set(`value`) {
        sourceCodeLocationState = value.toNullableFieldState()
      }

    private var vulnerabilitiesState: FieldState<List<Vulnerability>?> = FieldState.Absent

    /**
     * The products and respective version ranges affected by the advisory.
     * Required nullable field; assigning `null` records present-null.
     */
    public var vulnerabilities: List<Vulnerability>?
      get() = vulnerabilitiesState.valueOrNull()
      set(`value`) {
        vulnerabilitiesState = value.toNullableFieldState()
      }

    private var withdrawnAtState: FieldState<String?> = FieldState.Absent

    /**
     * The date and time of when the advisory was withdrawn, in ISO 8601 format.
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

    public fun build(): GlobalAdvisory {
      check(ghsaIdValue != null) { "ghsaId is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(publishedAtValue != null) { "publishedAt is required" }
      check(severityValue != null) { "severity is required" }
      check(summaryValue != null) { "summary is required" }
      check(typeValue != null) { "type is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(creditsState !== FieldState.Absent) { "credits is required, even when null" }
      check(cveIdState !== FieldState.Absent) { "cveId is required, even when null" }
      check(cvssState !== FieldState.Absent) { "cvss is required, even when null" }
      check(cwesState !== FieldState.Absent) { "cwes is required, even when null" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      check(githubReviewedAtState !== FieldState.Absent) { "githubReviewedAt is required, even when null" }
      check(identifiersState !== FieldState.Absent) { "identifiers is required, even when null" }
      check(nvdPublishedAtState !== FieldState.Absent) { "nvdPublishedAt is required, even when null" }
      check(referencesState !== FieldState.Absent) { "references is required, even when null" }
      check(repositoryAdvisoryUrlState !== FieldState.Absent) { "repositoryAdvisoryUrl is required, even when null" }
      check(sourceCodeLocationState !== FieldState.Absent) { "sourceCodeLocation is required, even when null" }
      check(vulnerabilitiesState !== FieldState.Absent) { "vulnerabilities is required, even when null" }
      check(withdrawnAtState !== FieldState.Absent) { "withdrawnAt is required, even when null" }
      return GlobalAdvisory(
        credits = creditsState.valueOrNull(),
        cveId = cveIdState.valueOrNull(),
        cvss = cvssState.valueOrNull(),
        cwes = cwesState.valueOrNull(),
        description = descriptionState.valueOrNull(),
        ghsaId = ghsaId,
        githubReviewedAt = githubReviewedAtState.valueOrNull(),
        htmlUrl = htmlUrl,
        identifiers = identifiersState.valueOrNull(),
        nvdPublishedAt = nvdPublishedAtState.valueOrNull(),
        publishedAt = publishedAt,
        references = referencesState.valueOrNull(),
        repositoryAdvisoryUrl = repositoryAdvisoryUrlState.valueOrNull(),
        severity = severity,
        sourceCodeLocation = sourceCodeLocationState.valueOrNull(),
        summary = summary,
        type = type,
        updatedAt = updatedAt,
        url = url,
        vulnerabilities = vulnerabilitiesState.valueOrNull(),
        withdrawnAt = withdrawnAtState.valueOrNull(),
        cvssSeveritiesState = cvssSeveritiesState,
        epssState = epssState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GlobalAdvisory = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<GlobalAdvisory> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GlobalAdvisory {
      val jsonDecoder = decoder.requireJsonDecoder("GlobalAdvisory")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GlobalAdvisory must be a JSON object")
      val ghsaId = json.decodeRequired<String>(rawObject, "ghsa_id")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val publishedAt = json.decodeRequired<String>(rawObject, "published_at")
      val severity = json.decodeRequired<InlineGlobalAdvisorySeverityXc542f37a>(rawObject, "severity")
      val summary = json.decodeRequired<String>(rawObject, "summary")
      val type = json.decodeRequired<InlineGlobalAdvisoryTypeX906a5d90>(rawObject, "type")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("credits")) {
        throw SerializationException("GlobalAdvisory is missing required property 'credits'")
      }
      val credits = rawObject["credits"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineGlobalAdvisoryCreditsItemXcbb55886>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("cve_id")) {
        throw SerializationException("GlobalAdvisory is missing required property 'cve_id'")
      }
      val cveId = rawObject["cve_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("cvss")) {
        throw SerializationException("GlobalAdvisory is missing required property 'cvss'")
      }
      val cvss = rawObject["cvss"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGlobalAdvisoryCvssX74f75226?>(requireNotNull(element)) }
      if (!rawObject.containsKey("cwes")) {
        throw SerializationException("GlobalAdvisory is missing required property 'cwes'")
      }
      val cwes = rawObject["cwes"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineGlobalAdvisoryCwesItemX1a9e04b8>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("description")) {
        throw SerializationException("GlobalAdvisory is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("github_reviewed_at")) {
        throw SerializationException("GlobalAdvisory is missing required property 'github_reviewed_at'")
      }
      val githubReviewedAt = rawObject["github_reviewed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("identifiers")) {
        throw SerializationException("GlobalAdvisory is missing required property 'identifiers'")
      }
      val identifiers = rawObject["identifiers"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineGlobalAdvisoryIdentifiersItemXa24e0c60>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("nvd_published_at")) {
        throw SerializationException("GlobalAdvisory is missing required property 'nvd_published_at'")
      }
      val nvdPublishedAt = rawObject["nvd_published_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("references")) {
        throw SerializationException("GlobalAdvisory is missing required property 'references'")
      }
      val references = rawObject["references"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("repository_advisory_url")) {
        throw SerializationException("GlobalAdvisory is missing required property 'repository_advisory_url'")
      }
      val repositoryAdvisoryUrl = rawObject["repository_advisory_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("source_code_location")) {
        throw SerializationException("GlobalAdvisory is missing required property 'source_code_location'")
      }
      val sourceCodeLocation = rawObject["source_code_location"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("vulnerabilities")) {
        throw SerializationException("GlobalAdvisory is missing required property 'vulnerabilities'")
      }
      val vulnerabilities = rawObject["vulnerabilities"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<Vulnerability>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("withdrawn_at")) {
        throw SerializationException("GlobalAdvisory is missing required property 'withdrawn_at'")
      }
      val withdrawnAt = rawObject["withdrawn_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return GlobalAdvisory(
        credits = credits,
        cveId = cveId,
        cvss = cvss,
        cwes = cwes,
        description = description,
        ghsaId = ghsaId,
        githubReviewedAt = githubReviewedAt,
        htmlUrl = htmlUrl,
        identifiers = identifiers,
        nvdPublishedAt = nvdPublishedAt,
        publishedAt = publishedAt,
        references = references,
        repositoryAdvisoryUrl = repositoryAdvisoryUrl,
        severity = severity,
        sourceCodeLocation = sourceCodeLocation,
        summary = summary,
        type = type,
        updatedAt = updatedAt,
        url = url,
        vulnerabilities = vulnerabilities,
        withdrawnAt = withdrawnAt,
        cvssSeveritiesState = json.decodeOptional(rawObject, "cvss_severities", nullable = true),
        epssState = json.decodeOptional(rawObject, "epss", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: GlobalAdvisory) {
      val jsonEncoder = encoder.requireJsonEncoder("GlobalAdvisory")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("credits", value.credits?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("cve_id", value.cveId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("cvss", value.cvss?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("cwes", value.cwes?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("ghsa_id", value.ghsaId)
        put("github_reviewed_at", value.githubReviewedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl)
        put("identifiers", value.identifiers?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("nvd_published_at", value.nvdPublishedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("published_at", value.publishedAt)
        put("references", value.references?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("repository_advisory_url", value.repositoryAdvisoryUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("severity", json.encodeToJsonElement(value.severity))
        put("source_code_location", value.sourceCodeLocation?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("summary", value.summary)
        put("type", json.encodeToJsonElement(value.type))
        put("updated_at", value.updatedAt)
        put("url", value.url)
        put("vulnerabilities", value.vulnerabilities?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("withdrawn_at", value.withdrawnAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("cvss_severities", value.cvssSeveritiesState, json::encodeToJsonElement)
        putState("epss", value.epssState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun globalAdvisory(block: GlobalAdvisory.Builder.() -> Unit): GlobalAdvisory = GlobalAdvisory.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GlobalAdvisory is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("GlobalAdvisory property '" + name + "' is not nullable")
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
