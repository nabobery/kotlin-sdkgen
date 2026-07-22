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
 * A repository security advisory.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-advisory
 */
@Serializable(with = RepositoryAdvisory.Serializer::class)
public class RepositoryAdvisory internal constructor(
  /**
   * The author of the advisory.
   */
  public val author: SimpleUser?,
  /**
   * The date and time of when the advisory was closed, in ISO 8601 format.
   */
  public val closedAt: String?,
  /**
   * A list of teams that collaborate on the advisory.
   */
  public val collaboratingTeams: List<Team>?,
  /**
   * A list of users that collaborate on the advisory.
   */
  public val collaboratingUsers: List<SimpleUser>?,
  /**
   * The date and time of when the advisory was created, in ISO 8601 format.
   */
  public val createdAt: String?,
  public val credits: List<InlineRepositoryAdvisoryCreditsItemX3245996c>?,
  public val creditsDetailed: List<RepositoryAdvisoryCredit>?,
  /**
   * The Common Vulnerabilities and Exposures (CVE) ID.
   */
  public val cveId: String?,
  public val cvss: InlineRepositoryAdvisoryCvssX2b855fad?,
  /**
   * A list of only the CWE IDs.
   */
  public val cweIds: List<String>?,
  public val cwes: List<InlineRepositoryAdvisoryCwesItemX1a42dfb5>?,
  /**
   * A detailed description of what the advisory entails.
   */
  public val description: String?,
  /**
   * The GitHub Security Advisory ID.
   */
  public val ghsaId: String,
  /**
   * The URL for the advisory.
   */
  public val htmlUrl: String,
  identifiers: List<InlineRepositoryAdvisoryIdentifiersItemX7eae0134>,
  /**
   * A temporary private fork of the advisory's repository for collaborating on a fix.
   */
  public val privateFork: SimpleRepository?,
  /**
   * The date and time of when the advisory was published, in ISO 8601 format.
   */
  public val publishedAt: String?,
  /**
   * The publisher of the advisory.
   */
  public val publisher: SimpleUser?,
  /**
   * The severity of the advisory.
   */
  public val severity: InlineRepositoryAdvisorySeverityX6156b938?,
  /**
   * The state of the advisory.
   */
  public val state: InlineRepositoryAdvisoryStateX956f296d,
  public val submission: InlineRepositoryAdvisorySubmissionXc91a0da7?,
  /**
   * A short summary of the advisory.
   */
  public val summary: String,
  /**
   * The date and time of when the advisory was last updated, in ISO 8601 format.
   */
  public val updatedAt: String?,
  /**
   * The API URL for the advisory.
   */
  public val url: String,
  public val vulnerabilities: List<RepositoryAdvisoryVulnerability>?,
  /**
   * The date and time of when the advisory was withdrawn, in ISO 8601 format.
   */
  public val withdrawnAt: String?,
  private val cvssSeveritiesState: FieldState<CvssSeverities?>,
) {
  public val identifiers: List<InlineRepositoryAdvisoryIdentifiersItemX7eae0134> =
      identifiers.toList()

  public val cvssSeverities: CvssSeverities?
    get() = cvssSeveritiesState.valueOrNull()

  public constructor(
    author: SimpleUser?,
    closedAt: String?,
    collaboratingTeams: List<Team>?,
    collaboratingUsers: List<SimpleUser>?,
    createdAt: String?,
    credits: List<InlineRepositoryAdvisoryCreditsItemX3245996c>?,
    creditsDetailed: List<RepositoryAdvisoryCredit>?,
    cveId: String?,
    cvss: InlineRepositoryAdvisoryCvssX2b855fad?,
    cweIds: List<String>?,
    cwes: List<InlineRepositoryAdvisoryCwesItemX1a42dfb5>?,
    description: String?,
    ghsaId: String,
    htmlUrl: String,
    identifiers: List<InlineRepositoryAdvisoryIdentifiersItemX7eae0134>,
    privateFork: SimpleRepository?,
    publishedAt: String?,
    publisher: SimpleUser?,
    severity: InlineRepositoryAdvisorySeverityX6156b938?,
    state: InlineRepositoryAdvisoryStateX956f296d,
    submission: InlineRepositoryAdvisorySubmissionXc91a0da7?,
    summary: String,
    updatedAt: String?,
    url: String,
    vulnerabilities: List<RepositoryAdvisoryVulnerability>?,
    withdrawnAt: String?,
  ) : this(author = author,
  closedAt = closedAt,
  collaboratingTeams = collaboratingTeams,
  collaboratingUsers = collaboratingUsers,
  createdAt = createdAt,
  credits = credits,
  creditsDetailed = creditsDetailed,
  cveId = cveId,
  cvss = cvss,
  cweIds = cweIds,
  cwes = cwes,
  description = description,
  ghsaId = ghsaId,
  htmlUrl = htmlUrl,
  identifiers = identifiers,
  privateFork = privateFork,
  publishedAt = publishedAt,
  publisher = publisher,
  severity = severity,
  state = state,
  submission = submission,
  summary = summary,
  updatedAt = updatedAt,
  url = url,
  vulnerabilities = vulnerabilities,
  withdrawnAt = withdrawnAt,
  cvssSeveritiesState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `cvss_severities`.
   */
  public fun cvssSeveritiesPresence(): FieldPresence = cvssSeveritiesState.presence

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

    private var identifiersValue: List<InlineRepositoryAdvisoryIdentifiersItemX7eae0134>? = null

    public var identifiers: List<InlineRepositoryAdvisoryIdentifiersItemX7eae0134>
      get() = requireNotNull(identifiersValue) { "identifiers is required" }
      set(`value`) {
        identifiersValue = value
      }

    private var stateValue: InlineRepositoryAdvisoryStateX956f296d? = null

    public var state: InlineRepositoryAdvisoryStateX956f296d
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var summaryValue: String? = null

    public var summary: String
      get() = requireNotNull(summaryValue) { "summary is required" }
      set(`value`) {
        summaryValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var authorState: FieldState<SimpleUser?> = FieldState.Absent

    /**
     * The author of the advisory.
     * Required nullable field; assigning `null` records present-null.
     */
    public var author: SimpleUser?
      get() = authorState.valueOrNull()
      set(`value`) {
        authorState = value.toNullableFieldState()
      }

    private var closedAtState: FieldState<String?> = FieldState.Absent

    /**
     * The date and time of when the advisory was closed, in ISO 8601 format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var closedAt: String?
      get() = closedAtState.valueOrNull()
      set(`value`) {
        closedAtState = value.toNullableFieldState()
      }

    private var collaboratingTeamsState: FieldState<List<Team>?> = FieldState.Absent

    /**
     * A list of teams that collaborate on the advisory.
     * Required nullable field; assigning `null` records present-null.
     */
    public var collaboratingTeams: List<Team>?
      get() = collaboratingTeamsState.valueOrNull()
      set(`value`) {
        collaboratingTeamsState = value.toNullableFieldState()
      }

    private var collaboratingUsersState: FieldState<List<SimpleUser>?> = FieldState.Absent

    /**
     * A list of users that collaborate on the advisory.
     * Required nullable field; assigning `null` records present-null.
     */
    public var collaboratingUsers: List<SimpleUser>?
      get() = collaboratingUsersState.valueOrNull()
      set(`value`) {
        collaboratingUsersState = value.toNullableFieldState()
      }

    private var createdAtState: FieldState<String?> = FieldState.Absent

    /**
     * The date and time of when the advisory was created, in ISO 8601 format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var createdAt: String?
      get() = createdAtState.valueOrNull()
      set(`value`) {
        createdAtState = value.toNullableFieldState()
      }

    private var creditsState: FieldState<List<InlineRepositoryAdvisoryCreditsItemX3245996c>?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var credits: List<InlineRepositoryAdvisoryCreditsItemX3245996c>?
      get() = creditsState.valueOrNull()
      set(`value`) {
        creditsState = value.toNullableFieldState()
      }

    private var creditsDetailedState: FieldState<List<RepositoryAdvisoryCredit>?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var creditsDetailed: List<RepositoryAdvisoryCredit>?
      get() = creditsDetailedState.valueOrNull()
      set(`value`) {
        creditsDetailedState = value.toNullableFieldState()
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

    private var cvssState: FieldState<InlineRepositoryAdvisoryCvssX2b855fad?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var cvss: InlineRepositoryAdvisoryCvssX2b855fad?
      get() = cvssState.valueOrNull()
      set(`value`) {
        cvssState = value.toNullableFieldState()
      }

    private var cweIdsState: FieldState<List<String>?> = FieldState.Absent

    /**
     * A list of only the CWE IDs.
     * Required nullable field; assigning `null` records present-null.
     */
    public var cweIds: List<String>?
      get() = cweIdsState.valueOrNull()
      set(`value`) {
        cweIdsState = value.toNullableFieldState()
      }

    private var cwesState: FieldState<List<InlineRepositoryAdvisoryCwesItemX1a42dfb5>?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var cwes: List<InlineRepositoryAdvisoryCwesItemX1a42dfb5>?
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

    private var privateForkState: FieldState<SimpleRepository?> = FieldState.Absent

    /**
     * A temporary private fork of the advisory's repository for collaborating on a fix.
     * Required nullable field; assigning `null` records present-null.
     */
    public var privateFork: SimpleRepository?
      get() = privateForkState.valueOrNull()
      set(`value`) {
        privateForkState = value.toNullableFieldState()
      }

    private var publishedAtState: FieldState<String?> = FieldState.Absent

    /**
     * The date and time of when the advisory was published, in ISO 8601 format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var publishedAt: String?
      get() = publishedAtState.valueOrNull()
      set(`value`) {
        publishedAtState = value.toNullableFieldState()
      }

    private var publisherState: FieldState<SimpleUser?> = FieldState.Absent

    /**
     * The publisher of the advisory.
     * Required nullable field; assigning `null` records present-null.
     */
    public var publisher: SimpleUser?
      get() = publisherState.valueOrNull()
      set(`value`) {
        publisherState = value.toNullableFieldState()
      }

    private var severityState: FieldState<InlineRepositoryAdvisorySeverityX6156b938?> =
        FieldState.Absent

    /**
     * The severity of the advisory.
     * Required nullable field; assigning `null` records present-null.
     */
    public var severity: InlineRepositoryAdvisorySeverityX6156b938?
      get() = severityState.valueOrNull()
      set(`value`) {
        severityState = value.toNullableFieldState()
      }

    private var submissionState: FieldState<InlineRepositoryAdvisorySubmissionXc91a0da7?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var submission: InlineRepositoryAdvisorySubmissionXc91a0da7?
      get() = submissionState.valueOrNull()
      set(`value`) {
        submissionState = value.toNullableFieldState()
      }

    private var updatedAtState: FieldState<String?> = FieldState.Absent

    /**
     * The date and time of when the advisory was last updated, in ISO 8601 format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var updatedAt: String?
      get() = updatedAtState.valueOrNull()
      set(`value`) {
        updatedAtState = value.toNullableFieldState()
      }

    private var vulnerabilitiesState: FieldState<List<RepositoryAdvisoryVulnerability>?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var vulnerabilities: List<RepositoryAdvisoryVulnerability>?
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

    /**
     * Omits `cvss_severities` from serialized output.
     */
    public fun unsetCvssSeverities() {
      cvssSeveritiesState = FieldState.Absent
    }

    public fun build(): RepositoryAdvisory {
      check(ghsaIdValue != null) { "ghsaId is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(identifiersValue != null) { "identifiers is required" }
      check(stateValue != null) { "state is required" }
      check(summaryValue != null) { "summary is required" }
      check(urlValue != null) { "url is required" }
      check(authorState !== FieldState.Absent) { "author is required, even when null" }
      check(closedAtState !== FieldState.Absent) { "closedAt is required, even when null" }
      check(collaboratingTeamsState !== FieldState.Absent) { "collaboratingTeams is required, even when null" }
      check(collaboratingUsersState !== FieldState.Absent) { "collaboratingUsers is required, even when null" }
      check(createdAtState !== FieldState.Absent) { "createdAt is required, even when null" }
      check(creditsState !== FieldState.Absent) { "credits is required, even when null" }
      check(creditsDetailedState !== FieldState.Absent) { "creditsDetailed is required, even when null" }
      check(cveIdState !== FieldState.Absent) { "cveId is required, even when null" }
      check(cvssState !== FieldState.Absent) { "cvss is required, even when null" }
      check(cweIdsState !== FieldState.Absent) { "cweIds is required, even when null" }
      check(cwesState !== FieldState.Absent) { "cwes is required, even when null" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      check(privateForkState !== FieldState.Absent) { "privateFork is required, even when null" }
      check(publishedAtState !== FieldState.Absent) { "publishedAt is required, even when null" }
      check(publisherState !== FieldState.Absent) { "publisher is required, even when null" }
      check(severityState !== FieldState.Absent) { "severity is required, even when null" }
      check(submissionState !== FieldState.Absent) { "submission is required, even when null" }
      check(updatedAtState !== FieldState.Absent) { "updatedAt is required, even when null" }
      check(vulnerabilitiesState !== FieldState.Absent) { "vulnerabilities is required, even when null" }
      check(withdrawnAtState !== FieldState.Absent) { "withdrawnAt is required, even when null" }
      return RepositoryAdvisory(
        author = authorState.valueOrNull(),
        closedAt = closedAtState.valueOrNull(),
        collaboratingTeams = collaboratingTeamsState.valueOrNull(),
        collaboratingUsers = collaboratingUsersState.valueOrNull(),
        createdAt = createdAtState.valueOrNull(),
        credits = creditsState.valueOrNull(),
        creditsDetailed = creditsDetailedState.valueOrNull(),
        cveId = cveIdState.valueOrNull(),
        cvss = cvssState.valueOrNull(),
        cweIds = cweIdsState.valueOrNull(),
        cwes = cwesState.valueOrNull(),
        description = descriptionState.valueOrNull(),
        ghsaId = ghsaId,
        htmlUrl = htmlUrl,
        identifiers = identifiers,
        privateFork = privateForkState.valueOrNull(),
        publishedAt = publishedAtState.valueOrNull(),
        publisher = publisherState.valueOrNull(),
        severity = severityState.valueOrNull(),
        state = state,
        submission = submissionState.valueOrNull(),
        summary = summary,
        updatedAt = updatedAtState.valueOrNull(),
        url = url,
        vulnerabilities = vulnerabilitiesState.valueOrNull(),
        withdrawnAt = withdrawnAtState.valueOrNull(),
        cvssSeveritiesState = cvssSeveritiesState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryAdvisory = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RepositoryAdvisory> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryAdvisory {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryAdvisory")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryAdvisory must be a JSON object")
      val ghsaId = json.decodeRequired<String>(rawObject, "ghsa_id")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val identifiers = json.decodeRequired<List<InlineRepositoryAdvisoryIdentifiersItemX7eae0134>>(rawObject, "identifiers")
      val state = json.decodeRequired<InlineRepositoryAdvisoryStateX956f296d>(rawObject, "state")
      val summary = json.decodeRequired<String>(rawObject, "summary")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("author")) {
        throw SerializationException("RepositoryAdvisory is missing required property 'author'")
      }
      val author = rawObject["author"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<SimpleUser?>(requireNotNull(element)) }
      if (!rawObject.containsKey("closed_at")) {
        throw SerializationException("RepositoryAdvisory is missing required property 'closed_at'")
      }
      val closedAt = rawObject["closed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("collaborating_teams")) {
        throw SerializationException("RepositoryAdvisory is missing required property 'collaborating_teams'")
      }
      val collaboratingTeams = rawObject["collaborating_teams"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<Team>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("collaborating_users")) {
        throw SerializationException("RepositoryAdvisory is missing required property 'collaborating_users'")
      }
      val collaboratingUsers = rawObject["collaborating_users"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<SimpleUser>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("created_at")) {
        throw SerializationException("RepositoryAdvisory is missing required property 'created_at'")
      }
      val createdAt = rawObject["created_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("credits")) {
        throw SerializationException("RepositoryAdvisory is missing required property 'credits'")
      }
      val credits = rawObject["credits"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineRepositoryAdvisoryCreditsItemX3245996c>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("credits_detailed")) {
        throw SerializationException("RepositoryAdvisory is missing required property 'credits_detailed'")
      }
      val creditsDetailed = rawObject["credits_detailed"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<RepositoryAdvisoryCredit>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("cve_id")) {
        throw SerializationException("RepositoryAdvisory is missing required property 'cve_id'")
      }
      val cveId = rawObject["cve_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("cvss")) {
        throw SerializationException("RepositoryAdvisory is missing required property 'cvss'")
      }
      val cvss = rawObject["cvss"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineRepositoryAdvisoryCvssX2b855fad?>(requireNotNull(element)) }
      if (!rawObject.containsKey("cwe_ids")) {
        throw SerializationException("RepositoryAdvisory is missing required property 'cwe_ids'")
      }
      val cweIds = rawObject["cwe_ids"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("cwes")) {
        throw SerializationException("RepositoryAdvisory is missing required property 'cwes'")
      }
      val cwes = rawObject["cwes"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineRepositoryAdvisoryCwesItemX1a42dfb5>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("description")) {
        throw SerializationException("RepositoryAdvisory is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("private_fork")) {
        throw SerializationException("RepositoryAdvisory is missing required property 'private_fork'")
      }
      val privateFork = rawObject["private_fork"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<SimpleRepository?>(requireNotNull(element)) }
      if (!rawObject.containsKey("published_at")) {
        throw SerializationException("RepositoryAdvisory is missing required property 'published_at'")
      }
      val publishedAt = rawObject["published_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("publisher")) {
        throw SerializationException("RepositoryAdvisory is missing required property 'publisher'")
      }
      val publisher = rawObject["publisher"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<SimpleUser?>(requireNotNull(element)) }
      if (!rawObject.containsKey("severity")) {
        throw SerializationException("RepositoryAdvisory is missing required property 'severity'")
      }
      val severity = rawObject["severity"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineRepositoryAdvisorySeverityX6156b938?>(requireNotNull(element)) }
      if (!rawObject.containsKey("submission")) {
        throw SerializationException("RepositoryAdvisory is missing required property 'submission'")
      }
      val submission = rawObject["submission"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineRepositoryAdvisorySubmissionXc91a0da7?>(requireNotNull(element)) }
      if (!rawObject.containsKey("updated_at")) {
        throw SerializationException("RepositoryAdvisory is missing required property 'updated_at'")
      }
      val updatedAt = rawObject["updated_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("vulnerabilities")) {
        throw SerializationException("RepositoryAdvisory is missing required property 'vulnerabilities'")
      }
      val vulnerabilities = rawObject["vulnerabilities"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<RepositoryAdvisoryVulnerability>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("withdrawn_at")) {
        throw SerializationException("RepositoryAdvisory is missing required property 'withdrawn_at'")
      }
      val withdrawnAt = rawObject["withdrawn_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return RepositoryAdvisory(
        author = author,
        closedAt = closedAt,
        collaboratingTeams = collaboratingTeams,
        collaboratingUsers = collaboratingUsers,
        createdAt = createdAt,
        credits = credits,
        creditsDetailed = creditsDetailed,
        cveId = cveId,
        cvss = cvss,
        cweIds = cweIds,
        cwes = cwes,
        description = description,
        ghsaId = ghsaId,
        htmlUrl = htmlUrl,
        identifiers = identifiers,
        privateFork = privateFork,
        publishedAt = publishedAt,
        publisher = publisher,
        severity = severity,
        state = state,
        submission = submission,
        summary = summary,
        updatedAt = updatedAt,
        url = url,
        vulnerabilities = vulnerabilities,
        withdrawnAt = withdrawnAt,
        cvssSeveritiesState = json.decodeOptional(rawObject, "cvss_severities", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryAdvisory) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryAdvisory")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("author", value.author?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("closed_at", value.closedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("collaborating_teams", value.collaboratingTeams?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("collaborating_users", value.collaboratingUsers?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", value.createdAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("credits", value.credits?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("credits_detailed", value.creditsDetailed?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("cve_id", value.cveId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("cvss", value.cvss?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("cwe_ids", value.cweIds?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("cwes", value.cwes?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("ghsa_id", value.ghsaId)
        put("html_url", value.htmlUrl)
        put("identifiers", json.encodeToJsonElement(value.identifiers))
        put("private_fork", value.privateFork?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("published_at", value.publishedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("publisher", value.publisher?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("severity", value.severity?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("state", json.encodeToJsonElement(value.state))
        put("submission", value.submission?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("summary", value.summary)
        put("updated_at", value.updatedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("url", value.url)
        put("vulnerabilities", value.vulnerabilities?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("withdrawn_at", value.withdrawnAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("cvss_severities", value.cvssSeveritiesState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryAdvisory(block: RepositoryAdvisory.Builder.() -> Unit): RepositoryAdvisory = RepositoryAdvisory.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryAdvisory is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("RepositoryAdvisory property '" + name + "' is not nullable")
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
