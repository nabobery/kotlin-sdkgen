package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The configuration for GitHub Pages for a repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/page
 */
@Serializable(with = Page.Serializer::class)
public class Page internal constructor(
  /**
   * The Pages site's custom domain
   */
  public val cname: String?,
  /**
   * Whether the Page has a custom 404 page.
   */
  public val custom404: Boolean,
  /**
   * Whether the GitHub Pages site is publicly visible. If set to `true`, the site is accessible to anyone on the
   * internet. If set to `false`, the site will only be accessible to users who have at least `read` access to the
   * repository that published the site.
   */
  public val `public`: Boolean,
  /**
   * The status of the most recent build of the Page.
   */
  public val status: InlinePageStatusX84717990?,
  /**
   * The API address for accessing this Page resource.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val buildTypeState: FieldState<InlinePageBuildTypeX12695bb1?>,
  private val htmlUrlState: FieldState<String>,
  private val httpsCertificateState: FieldState<PagesHttpsCertificate>,
  private val httpsEnforcedState: FieldState<Boolean>,
  private val pendingDomainUnverifiedAtState: FieldState<String?>,
  private val protectedDomainStateState: FieldState<InlinePageProtectedDomainStateX455cec3c?>,
  private val sourceState: FieldState<PagesSourceHash>,
) {
  /**
   * The process in which the Page will be built.
   */
  public val buildType: InlinePageBuildTypeX12695bb1?
    get() = buildTypeState.valueOrNull()

  /**
   * The web address the Page can be accessed from.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String?
    get() = htmlUrlState.valueOrNull()

  public val httpsCertificate: PagesHttpsCertificate?
    get() = httpsCertificateState.valueOrNull()

  /**
   * Whether https is enabled on the domain
   */
  public val httpsEnforced: Boolean?
    get() = httpsEnforcedState.valueOrNull()

  /**
   * The timestamp when a pending domain becomes unverified.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pendingDomainUnverifiedAt: String?
    get() = pendingDomainUnverifiedAtState.valueOrNull()

  /**
   * The state if the domain is verified
   */
  public val protectedDomainState: InlinePageProtectedDomainStateX455cec3c?
    get() = protectedDomainStateState.valueOrNull()

  public val source: PagesSourceHash?
    get() = sourceState.valueOrNull()

  public constructor(
    cname: String?,
    custom404: Boolean,
    `public`: Boolean,
    status: InlinePageStatusX84717990?,
    url: String,
  ) : this(cname = cname,
  custom404 = custom404,
  public = public,
  status = status,
  url = url,
  buildTypeState = FieldState.Absent,
  htmlUrlState = FieldState.Absent,
  httpsCertificateState = FieldState.Absent,
  httpsEnforcedState = FieldState.Absent,
  pendingDomainUnverifiedAtState = FieldState.Absent,
  protectedDomainStateState = FieldState.Absent,
  sourceState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `build_type`.
   */
  public fun buildTypePresence(): FieldPresence = buildTypeState.presence

  /**
   * Returns the wire presence of `html_url`.
   */
  public fun htmlUrlPresence(): FieldPresence = htmlUrlState.presence

  /**
   * Returns the wire presence of `https_certificate`.
   */
  public fun httpsCertificatePresence(): FieldPresence = httpsCertificateState.presence

  /**
   * Returns the wire presence of `https_enforced`.
   */
  public fun httpsEnforcedPresence(): FieldPresence = httpsEnforcedState.presence

  /**
   * Returns the wire presence of `pending_domain_unverified_at`.
   */
  public fun pendingDomainUnverifiedAtPresence(): FieldPresence = pendingDomainUnverifiedAtState.presence

  /**
   * Returns the wire presence of `protected_domain_state`.
   */
  public fun protectedDomainStatePresence(): FieldPresence = protectedDomainStateState.presence

  /**
   * Returns the wire presence of `source`.
   */
  public fun sourcePresence(): FieldPresence = sourceState.presence

  public class Builder {
    private var custom404Value: Boolean? = null

    public var custom404: Boolean
      get() = requireNotNull(custom404Value) { "custom404 is required" }
      set(`value`) {
        custom404Value = value
      }

    private var publicValue: Boolean? = null

    public var `public`: Boolean
      get() = requireNotNull(publicValue) { "public is required" }
      set(`value`) {
        publicValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var cnameState: FieldState<String?> = FieldState.Absent

    /**
     * The Pages site's custom domain
     * Required nullable field; assigning `null` records present-null.
     */
    public var cname: String?
      get() = cnameState.valueOrNull()
      set(`value`) {
        cnameState = value.toNullableFieldState()
      }

    private var statusState: FieldState<InlinePageStatusX84717990?> = FieldState.Absent

    /**
     * The status of the most recent build of the Page.
     * Required nullable field; assigning `null` records present-null.
     */
    public var status: InlinePageStatusX84717990?
      get() = statusState.valueOrNull()
      set(`value`) {
        statusState = value.toNullableFieldState()
      }

    private var buildTypeState: FieldState<InlinePageBuildTypeX12695bb1?> = FieldState.Absent

    /**
     * The process in which the Page will be built.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var buildType: InlinePageBuildTypeX12695bb1?
      get() = buildTypeState.valueOrNull()
      set(`value`) {
        buildTypeState = value.toNullableFieldState()
      }

    private var htmlUrlState: FieldState<String> = FieldState.Absent

    /**
     * The web address the Page can be accessed from.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var htmlUrl: String?
      get() = htmlUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "htmlUrl is not nullable; call unsetHtmlUrl() to omit it" }
        htmlUrlState = FieldState.Value(present)
      }

    private var httpsCertificateState: FieldState<PagesHttpsCertificate> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var httpsCertificate: PagesHttpsCertificate?
      get() = httpsCertificateState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "httpsCertificate is not nullable; call unsetHttpsCertificate() to omit it" }
        httpsCertificateState = FieldState.Value(present)
      }

    private var httpsEnforcedState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether https is enabled on the domain
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var httpsEnforced: Boolean?
      get() = httpsEnforcedState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "httpsEnforced is not nullable; call unsetHttpsEnforced() to omit it" }
        httpsEnforcedState = FieldState.Value(present)
      }

    private var pendingDomainUnverifiedAtState: FieldState<String?> = FieldState.Absent

    /**
     * The timestamp when a pending domain becomes unverified.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var pendingDomainUnverifiedAt: String?
      get() = pendingDomainUnverifiedAtState.valueOrNull()
      set(`value`) {
        pendingDomainUnverifiedAtState = value.toNullableFieldState()
      }

    private var protectedDomainStateState: FieldState<InlinePageProtectedDomainStateX455cec3c?> =
        FieldState.Absent

    /**
     * The state if the domain is verified
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var protectedDomainState: InlinePageProtectedDomainStateX455cec3c?
      get() = protectedDomainStateState.valueOrNull()
      set(`value`) {
        protectedDomainStateState = value.toNullableFieldState()
      }

    private var sourceState: FieldState<PagesSourceHash> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var source: PagesSourceHash?
      get() = sourceState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "source is not nullable; call unsetSource() to omit it" }
        sourceState = FieldState.Value(present)
      }

    /**
     * Omits `build_type` from serialized output.
     */
    public fun unsetBuildType() {
      buildTypeState = FieldState.Absent
    }

    /**
     * Omits `html_url` from serialized output.
     */
    public fun unsetHtmlUrl() {
      htmlUrlState = FieldState.Absent
    }

    /**
     * Omits `https_certificate` from serialized output.
     */
    public fun unsetHttpsCertificate() {
      httpsCertificateState = FieldState.Absent
    }

    /**
     * Omits `https_enforced` from serialized output.
     */
    public fun unsetHttpsEnforced() {
      httpsEnforcedState = FieldState.Absent
    }

    /**
     * Omits `pending_domain_unverified_at` from serialized output.
     */
    public fun unsetPendingDomainUnverifiedAt() {
      pendingDomainUnverifiedAtState = FieldState.Absent
    }

    /**
     * Omits `protected_domain_state` from serialized output.
     */
    public fun unsetProtectedDomainState() {
      protectedDomainStateState = FieldState.Absent
    }

    /**
     * Omits `source` from serialized output.
     */
    public fun unsetSource() {
      sourceState = FieldState.Absent
    }

    public fun build(): Page {
      check(custom404Value != null) { "custom404 is required" }
      check(publicValue != null) { "public is required" }
      check(urlValue != null) { "url is required" }
      check(cnameState !== FieldState.Absent) { "cname is required, even when null" }
      check(statusState !== FieldState.Absent) { "status is required, even when null" }
      return Page(
        cname = cnameState.valueOrNull(),
        custom404 = custom404,
        public = public,
        status = statusState.valueOrNull(),
        url = url,
        buildTypeState = buildTypeState,
        htmlUrlState = htmlUrlState,
        httpsCertificateState = httpsCertificateState,
        httpsEnforcedState = httpsEnforcedState,
        pendingDomainUnverifiedAtState = pendingDomainUnverifiedAtState,
        protectedDomainStateState = protectedDomainStateState,
        sourceState = sourceState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Page = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Page> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Page {
      val jsonDecoder = decoder.requireJsonDecoder("Page")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Page must be a JSON object")
      val custom404 = json.decodeRequired<Boolean>(rawObject, "custom_404")
      val public = json.decodeRequired<Boolean>(rawObject, "public")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("cname")) {
        throw SerializationException("Page is missing required property 'cname'")
      }
      val cname = rawObject["cname"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("status")) {
        throw SerializationException("Page is missing required property 'status'")
      }
      val status = rawObject["status"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePageStatusX84717990?>(requireNotNull(element)) }
      return Page(
        cname = cname,
        custom404 = custom404,
        public = public,
        status = status,
        url = url,
        buildTypeState = json.decodeOptional(rawObject, "build_type", nullable = true),
        htmlUrlState = json.decodeOptional(rawObject, "html_url", nullable = false),
        httpsCertificateState = json.decodeOptional(rawObject, "https_certificate", nullable = false),
        httpsEnforcedState = json.decodeOptional(rawObject, "https_enforced", nullable = false),
        pendingDomainUnverifiedAtState = json.decodeOptional(rawObject, "pending_domain_unverified_at", nullable = true),
        protectedDomainStateState = json.decodeOptional(rawObject, "protected_domain_state", nullable = true),
        sourceState = json.decodeOptional(rawObject, "source", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: Page) {
      val jsonEncoder = encoder.requireJsonEncoder("Page")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cname", value.cname?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("custom_404", json.encodeToJsonElement(value.custom404))
        put("public", json.encodeToJsonElement(value.public))
        put("status", value.status?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("url", value.url)
        putState("build_type", value.buildTypeState, json::encodeToJsonElement)
        putState("html_url", value.htmlUrlState, json::encodeToJsonElement)
        putState("https_certificate", value.httpsCertificateState, json::encodeToJsonElement)
        putState("https_enforced", value.httpsEnforcedState, json::encodeToJsonElement)
        putState("pending_domain_unverified_at", value.pendingDomainUnverifiedAtState, json::encodeToJsonElement)
        putState("protected_domain_state", value.protectedDomainStateState, json::encodeToJsonElement)
        putState("source", value.sourceState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun page(block: Page.Builder.() -> Unit): Page = Page.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Page is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("Page property '" + name + "' is not nullable")
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
