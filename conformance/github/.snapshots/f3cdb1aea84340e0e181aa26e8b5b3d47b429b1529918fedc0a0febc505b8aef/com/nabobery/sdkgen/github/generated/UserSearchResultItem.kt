package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
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
 * User Search Result Item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/user-search-result-item
 */
@Serializable(with = UserSearchResultItem.Serializer::class)
public class UserSearchResultItem internal constructor(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val avatarUrl: String,
  public val eventsUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val followersUrl: String,
  public val followingUrl: String,
  public val gistsUrl: String,
  public val gravatarId: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Long,
  public val login: String,
  public val nodeId: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val organizationsUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val receivedEventsUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val reposUrl: String,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val score: Double,
  public val siteAdmin: Boolean,
  public val starredUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val subscriptionsUrl: String,
  public val type: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val bioState: FieldState<String?>,
  private val blogState: FieldState<String?>,
  private val companyState: FieldState<String?>,
  private val createdAtState: FieldState<String>,
  private val emailState: FieldState<String?>,
  private val followersState: FieldState<Int>,
  private val followingState: FieldState<Int>,
  private val hireableState: FieldState<Boolean?>,
  private val locationState: FieldState<String?>,
  private val nameState: FieldState<String?>,
  private val publicGistsState: FieldState<Int>,
  private val publicReposState: FieldState<Int>,
  private val suspendedAtState: FieldState<String?>,
  textMatchesState: FieldState<List<InlineSearchResultTextMatchesItemXe380e62a>>,
  private val updatedAtState: FieldState<String>,
  private val userViewTypeState: FieldState<String>,
) {
  private val textMatchesState: FieldState<List<InlineSearchResultTextMatchesItemXe380e62a>> =
      textMatchesState.copyValue { fieldValue -> fieldValue.toList() }

  public val bio: String?
    get() = bioState.valueOrNull()

  public val blog: String?
    get() = blogState.valueOrNull()

  public val company: String?
    get() = companyState.valueOrNull()

  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String?
    get() = createdAtState.valueOrNull()

  /**
   * Wire format: `email`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val email: String?
    get() = emailState.valueOrNull()

  public val followers: Int?
    get() = followersState.valueOrNull()

  public val following: Int?
    get() = followingState.valueOrNull()

  public val hireable: Boolean?
    get() = hireableState.valueOrNull()

  public val location: String?
    get() = locationState.valueOrNull()

  public val name: String?
    get() = nameState.valueOrNull()

  public val publicGists: Int?
    get() = publicGistsState.valueOrNull()

  public val publicRepos: Int?
    get() = publicReposState.valueOrNull()

  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val suspendedAt: String?
    get() = suspendedAtState.valueOrNull()

  public val textMatches: List<InlineSearchResultTextMatchesItemXe380e62a>?
    get() = textMatchesState.valueOrNull()

  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String?
    get() = updatedAtState.valueOrNull()

  public val userViewType: String?
    get() = userViewTypeState.valueOrNull()

  public constructor(
    avatarUrl: String,
    eventsUrl: String,
    followersUrl: String,
    followingUrl: String,
    gistsUrl: String,
    gravatarId: String?,
    htmlUrl: String,
    id: Long,
    login: String,
    nodeId: String,
    organizationsUrl: String,
    receivedEventsUrl: String,
    reposUrl: String,
    score: Double,
    siteAdmin: Boolean,
    starredUrl: String,
    subscriptionsUrl: String,
    type: String,
    url: String,
  ) : this(avatarUrl = avatarUrl,
  eventsUrl = eventsUrl,
  followersUrl = followersUrl,
  followingUrl = followingUrl,
  gistsUrl = gistsUrl,
  gravatarId = gravatarId,
  htmlUrl = htmlUrl,
  id = id,
  login = login,
  nodeId = nodeId,
  organizationsUrl = organizationsUrl,
  receivedEventsUrl = receivedEventsUrl,
  reposUrl = reposUrl,
  score = score,
  siteAdmin = siteAdmin,
  starredUrl = starredUrl,
  subscriptionsUrl = subscriptionsUrl,
  type = type,
  url = url,
  bioState = FieldState.Absent,
  blogState = FieldState.Absent,
  companyState = FieldState.Absent,
  createdAtState = FieldState.Absent,
  emailState = FieldState.Absent,
  followersState = FieldState.Absent,
  followingState = FieldState.Absent,
  hireableState = FieldState.Absent,
  locationState = FieldState.Absent,
  nameState = FieldState.Absent,
  publicGistsState = FieldState.Absent,
  publicReposState = FieldState.Absent,
  suspendedAtState = FieldState.Absent,
  textMatchesState = FieldState.Absent,
  updatedAtState = FieldState.Absent,
  userViewTypeState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `bio`.
   */
  public fun bioPresence(): FieldPresence = bioState.presence

  /**
   * Returns the wire presence of `blog`.
   */
  public fun blogPresence(): FieldPresence = blogState.presence

  /**
   * Returns the wire presence of `company`.
   */
  public fun companyPresence(): FieldPresence = companyState.presence

  /**
   * Returns the wire presence of `created_at`.
   */
  public fun createdAtPresence(): FieldPresence = createdAtState.presence

  /**
   * Returns the wire presence of `email`.
   */
  public fun emailPresence(): FieldPresence = emailState.presence

  /**
   * Returns the wire presence of `followers`.
   */
  public fun followersPresence(): FieldPresence = followersState.presence

  /**
   * Returns the wire presence of `following`.
   */
  public fun followingPresence(): FieldPresence = followingState.presence

  /**
   * Returns the wire presence of `hireable`.
   */
  public fun hireablePresence(): FieldPresence = hireableState.presence

  /**
   * Returns the wire presence of `location`.
   */
  public fun locationPresence(): FieldPresence = locationState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `public_gists`.
   */
  public fun publicGistsPresence(): FieldPresence = publicGistsState.presence

  /**
   * Returns the wire presence of `public_repos`.
   */
  public fun publicReposPresence(): FieldPresence = publicReposState.presence

  /**
   * Returns the wire presence of `suspended_at`.
   */
  public fun suspendedAtPresence(): FieldPresence = suspendedAtState.presence

  /**
   * Returns the wire presence of `text_matches`.
   */
  public fun textMatchesPresence(): FieldPresence = textMatchesState.presence

  /**
   * Returns the wire presence of `updated_at`.
   */
  public fun updatedAtPresence(): FieldPresence = updatedAtState.presence

  /**
   * Returns the wire presence of `user_view_type`.
   */
  public fun userViewTypePresence(): FieldPresence = userViewTypeState.presence

  public class Builder {
    private var avatarUrlValue: String? = null

    public var avatarUrl: String
      get() = requireNotNull(avatarUrlValue) { "avatarUrl is required" }
      set(`value`) {
        avatarUrlValue = value
      }

    private var eventsUrlValue: String? = null

    public var eventsUrl: String
      get() = requireNotNull(eventsUrlValue) { "eventsUrl is required" }
      set(`value`) {
        eventsUrlValue = value
      }

    private var followersUrlValue: String? = null

    public var followersUrl: String
      get() = requireNotNull(followersUrlValue) { "followersUrl is required" }
      set(`value`) {
        followersUrlValue = value
      }

    private var followingUrlValue: String? = null

    public var followingUrl: String
      get() = requireNotNull(followingUrlValue) { "followingUrl is required" }
      set(`value`) {
        followingUrlValue = value
      }

    private var gistsUrlValue: String? = null

    public var gistsUrl: String
      get() = requireNotNull(gistsUrlValue) { "gistsUrl is required" }
      set(`value`) {
        gistsUrlValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var loginValue: String? = null

    public var login: String
      get() = requireNotNull(loginValue) { "login is required" }
      set(`value`) {
        loginValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var organizationsUrlValue: String? = null

    public var organizationsUrl: String
      get() = requireNotNull(organizationsUrlValue) { "organizationsUrl is required" }
      set(`value`) {
        organizationsUrlValue = value
      }

    private var receivedEventsUrlValue: String? = null

    public var receivedEventsUrl: String
      get() = requireNotNull(receivedEventsUrlValue) { "receivedEventsUrl is required" }
      set(`value`) {
        receivedEventsUrlValue = value
      }

    private var reposUrlValue: String? = null

    public var reposUrl: String
      get() = requireNotNull(reposUrlValue) { "reposUrl is required" }
      set(`value`) {
        reposUrlValue = value
      }

    private var scoreValue: Double? = null

    public var score: Double
      get() = requireNotNull(scoreValue) { "score is required" }
      set(`value`) {
        scoreValue = value
      }

    private var siteAdminValue: Boolean? = null

    public var siteAdmin: Boolean
      get() = requireNotNull(siteAdminValue) { "siteAdmin is required" }
      set(`value`) {
        siteAdminValue = value
      }

    private var starredUrlValue: String? = null

    public var starredUrl: String
      get() = requireNotNull(starredUrlValue) { "starredUrl is required" }
      set(`value`) {
        starredUrlValue = value
      }

    private var subscriptionsUrlValue: String? = null

    public var subscriptionsUrl: String
      get() = requireNotNull(subscriptionsUrlValue) { "subscriptionsUrl is required" }
      set(`value`) {
        subscriptionsUrlValue = value
      }

    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var gravatarIdState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var gravatarId: String?
      get() = gravatarIdState.valueOrNull()
      set(`value`) {
        gravatarIdState = value.toNullableFieldState()
      }

    private var bioState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var bio: String?
      get() = bioState.valueOrNull()
      set(`value`) {
        bioState = value.toNullableFieldState()
      }

    private var blogState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var blog: String?
      get() = blogState.valueOrNull()
      set(`value`) {
        blogState = value.toNullableFieldState()
      }

    private var companyState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var company: String?
      get() = companyState.valueOrNull()
      set(`value`) {
        companyState = value.toNullableFieldState()
      }

    private var createdAtState: FieldState<String> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var createdAt: String?
      get() = createdAtState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "createdAt is not nullable; call unsetCreatedAt() to omit it" }
        createdAtState = FieldState.Value(present)
      }

    private var emailState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `email`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var email: String?
      get() = emailState.valueOrNull()
      set(`value`) {
        emailState = value.toNullableFieldState()
      }

    private var followersState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var followers: Int?
      get() = followersState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "followers is not nullable; call unsetFollowers() to omit it" }
        followersState = FieldState.Value(present)
      }

    private var followingState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var following: Int?
      get() = followingState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "following is not nullable; call unsetFollowing() to omit it" }
        followingState = FieldState.Value(present)
      }

    private var hireableState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var hireable: Boolean?
      get() = hireableState.valueOrNull()
      set(`value`) {
        hireableState = value.toNullableFieldState()
      }

    private var locationState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var location: String?
      get() = locationState.valueOrNull()
      set(`value`) {
        locationState = value.toNullableFieldState()
      }

    private var nameState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        nameState = value.toNullableFieldState()
      }

    private var publicGistsState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var publicGists: Int?
      get() = publicGistsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "publicGists is not nullable; call unsetPublicGists() to omit it" }
        publicGistsState = FieldState.Value(present)
      }

    private var publicReposState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var publicRepos: Int?
      get() = publicReposState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "publicRepos is not nullable; call unsetPublicRepos() to omit it" }
        publicReposState = FieldState.Value(present)
      }

    private var suspendedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var suspendedAt: String?
      get() = suspendedAtState.valueOrNull()
      set(`value`) {
        suspendedAtState = value.toNullableFieldState()
      }

    private var textMatchesState: FieldState<List<InlineSearchResultTextMatchesItemXe380e62a>> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var textMatches: List<InlineSearchResultTextMatchesItemXe380e62a>?
      get() = textMatchesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "textMatches is not nullable; call unsetTextMatches() to omit it" }
        textMatchesState = FieldState.Value(present.toList())
      }

    private var updatedAtState: FieldState<String> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var updatedAt: String?
      get() = updatedAtState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "updatedAt is not nullable; call unsetUpdatedAt() to omit it" }
        updatedAtState = FieldState.Value(present)
      }

    private var userViewTypeState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var userViewType: String?
      get() = userViewTypeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "userViewType is not nullable; call unsetUserViewType() to omit it" }
        userViewTypeState = FieldState.Value(present)
      }

    /**
     * Omits `bio` from serialized output.
     */
    public fun unsetBio() {
      bioState = FieldState.Absent
    }

    /**
     * Omits `blog` from serialized output.
     */
    public fun unsetBlog() {
      blogState = FieldState.Absent
    }

    /**
     * Omits `company` from serialized output.
     */
    public fun unsetCompany() {
      companyState = FieldState.Absent
    }

    /**
     * Omits `created_at` from serialized output.
     */
    public fun unsetCreatedAt() {
      createdAtState = FieldState.Absent
    }

    /**
     * Omits `email` from serialized output.
     */
    public fun unsetEmail() {
      emailState = FieldState.Absent
    }

    /**
     * Omits `followers` from serialized output.
     */
    public fun unsetFollowers() {
      followersState = FieldState.Absent
    }

    /**
     * Omits `following` from serialized output.
     */
    public fun unsetFollowing() {
      followingState = FieldState.Absent
    }

    /**
     * Omits `hireable` from serialized output.
     */
    public fun unsetHireable() {
      hireableState = FieldState.Absent
    }

    /**
     * Omits `location` from serialized output.
     */
    public fun unsetLocation() {
      locationState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `public_gists` from serialized output.
     */
    public fun unsetPublicGists() {
      publicGistsState = FieldState.Absent
    }

    /**
     * Omits `public_repos` from serialized output.
     */
    public fun unsetPublicRepos() {
      publicReposState = FieldState.Absent
    }

    /**
     * Omits `suspended_at` from serialized output.
     */
    public fun unsetSuspendedAt() {
      suspendedAtState = FieldState.Absent
    }

    /**
     * Omits `text_matches` from serialized output.
     */
    public fun unsetTextMatches() {
      textMatchesState = FieldState.Absent
    }

    /**
     * Omits `updated_at` from serialized output.
     */
    public fun unsetUpdatedAt() {
      updatedAtState = FieldState.Absent
    }

    /**
     * Omits `user_view_type` from serialized output.
     */
    public fun unsetUserViewType() {
      userViewTypeState = FieldState.Absent
    }

    public fun build(): UserSearchResultItem {
      check(avatarUrlValue != null) { "avatarUrl is required" }
      check(eventsUrlValue != null) { "eventsUrl is required" }
      check(followersUrlValue != null) { "followersUrl is required" }
      check(followingUrlValue != null) { "followingUrl is required" }
      check(gistsUrlValue != null) { "gistsUrl is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(loginValue != null) { "login is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(organizationsUrlValue != null) { "organizationsUrl is required" }
      check(receivedEventsUrlValue != null) { "receivedEventsUrl is required" }
      check(reposUrlValue != null) { "reposUrl is required" }
      check(scoreValue != null) { "score is required" }
      check(siteAdminValue != null) { "siteAdmin is required" }
      check(starredUrlValue != null) { "starredUrl is required" }
      check(subscriptionsUrlValue != null) { "subscriptionsUrl is required" }
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      check(gravatarIdState !== FieldState.Absent) { "gravatarId is required, even when null" }
      return UserSearchResultItem(
        avatarUrl = avatarUrl,
        eventsUrl = eventsUrl,
        followersUrl = followersUrl,
        followingUrl = followingUrl,
        gistsUrl = gistsUrl,
        gravatarId = gravatarIdState.valueOrNull(),
        htmlUrl = htmlUrl,
        id = id,
        login = login,
        nodeId = nodeId,
        organizationsUrl = organizationsUrl,
        receivedEventsUrl = receivedEventsUrl,
        reposUrl = reposUrl,
        score = score,
        siteAdmin = siteAdmin,
        starredUrl = starredUrl,
        subscriptionsUrl = subscriptionsUrl,
        type = type,
        url = url,
        bioState = bioState,
        blogState = blogState,
        companyState = companyState,
        createdAtState = createdAtState,
        emailState = emailState,
        followersState = followersState,
        followingState = followingState,
        hireableState = hireableState,
        locationState = locationState,
        nameState = nameState,
        publicGistsState = publicGistsState,
        publicReposState = publicReposState,
        suspendedAtState = suspendedAtState,
        textMatchesState = textMatchesState,
        updatedAtState = updatedAtState,
        userViewTypeState = userViewTypeState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): UserSearchResultItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<UserSearchResultItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): UserSearchResultItem {
      val jsonDecoder = decoder.requireJsonDecoder("UserSearchResultItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("UserSearchResultItem must be a JSON object")
      val avatarUrl = json.decodeRequired<String>(rawObject, "avatar_url")
      val eventsUrl = json.decodeRequired<String>(rawObject, "events_url")
      val followersUrl = json.decodeRequired<String>(rawObject, "followers_url")
      val followingUrl = json.decodeRequired<String>(rawObject, "following_url")
      val gistsUrl = json.decodeRequired<String>(rawObject, "gists_url")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val login = json.decodeRequired<String>(rawObject, "login")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val organizationsUrl = json.decodeRequired<String>(rawObject, "organizations_url")
      val receivedEventsUrl = json.decodeRequired<String>(rawObject, "received_events_url")
      val reposUrl = json.decodeRequired<String>(rawObject, "repos_url")
      val score = json.decodeRequired<Double>(rawObject, "score")
      val siteAdmin = json.decodeRequired<Boolean>(rawObject, "site_admin")
      val starredUrl = json.decodeRequired<String>(rawObject, "starred_url")
      val subscriptionsUrl = json.decodeRequired<String>(rawObject, "subscriptions_url")
      val type = json.decodeRequired<String>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("gravatar_id")) {
        throw SerializationException("UserSearchResultItem is missing required property 'gravatar_id'")
      }
      val gravatarId = rawObject["gravatar_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return UserSearchResultItem(
        avatarUrl = avatarUrl,
        eventsUrl = eventsUrl,
        followersUrl = followersUrl,
        followingUrl = followingUrl,
        gistsUrl = gistsUrl,
        gravatarId = gravatarId,
        htmlUrl = htmlUrl,
        id = id,
        login = login,
        nodeId = nodeId,
        organizationsUrl = organizationsUrl,
        receivedEventsUrl = receivedEventsUrl,
        reposUrl = reposUrl,
        score = score,
        siteAdmin = siteAdmin,
        starredUrl = starredUrl,
        subscriptionsUrl = subscriptionsUrl,
        type = type,
        url = url,
        bioState = json.decodeOptional(rawObject, "bio", nullable = true),
        blogState = json.decodeOptional(rawObject, "blog", nullable = true),
        companyState = json.decodeOptional(rawObject, "company", nullable = true),
        createdAtState = json.decodeOptional(rawObject, "created_at", nullable = false),
        emailState = json.decodeOptional(rawObject, "email", nullable = true),
        followersState = json.decodeOptional(rawObject, "followers", nullable = false),
        followingState = json.decodeOptional(rawObject, "following", nullable = false),
        hireableState = json.decodeOptional(rawObject, "hireable", nullable = true),
        locationState = json.decodeOptional(rawObject, "location", nullable = true),
        nameState = json.decodeOptional(rawObject, "name", nullable = true),
        publicGistsState = json.decodeOptional(rawObject, "public_gists", nullable = false),
        publicReposState = json.decodeOptional(rawObject, "public_repos", nullable = false),
        suspendedAtState = json.decodeOptional(rawObject, "suspended_at", nullable = true),
        textMatchesState = json.decodeOptional(rawObject, "text_matches", nullable = false),
        updatedAtState = json.decodeOptional(rawObject, "updated_at", nullable = false),
        userViewTypeState = json.decodeOptional(rawObject, "user_view_type", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: UserSearchResultItem) {
      val jsonEncoder = encoder.requireJsonEncoder("UserSearchResultItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("avatar_url", value.avatarUrl)
        put("events_url", value.eventsUrl)
        put("followers_url", value.followersUrl)
        put("following_url", value.followingUrl)
        put("gists_url", value.gistsUrl)
        put("gravatar_id", value.gravatarId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("login", value.login)
        put("node_id", value.nodeId)
        put("organizations_url", value.organizationsUrl)
        put("received_events_url", value.receivedEventsUrl)
        put("repos_url", value.reposUrl)
        put("score", json.encodeToJsonElement(value.score))
        put("site_admin", json.encodeToJsonElement(value.siteAdmin))
        put("starred_url", value.starredUrl)
        put("subscriptions_url", value.subscriptionsUrl)
        put("type", value.type)
        put("url", value.url)
        putState("bio", value.bioState, json::encodeToJsonElement)
        putState("blog", value.blogState, json::encodeToJsonElement)
        putState("company", value.companyState, json::encodeToJsonElement)
        putState("created_at", value.createdAtState, json::encodeToJsonElement)
        putState("email", value.emailState, json::encodeToJsonElement)
        putState("followers", value.followersState, json::encodeToJsonElement)
        putState("following", value.followingState, json::encodeToJsonElement)
        putState("hireable", value.hireableState, json::encodeToJsonElement)
        putState("location", value.locationState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("public_gists", value.publicGistsState, json::encodeToJsonElement)
        putState("public_repos", value.publicReposState, json::encodeToJsonElement)
        putState("suspended_at", value.suspendedAtState, json::encodeToJsonElement)
        putState("text_matches", value.textMatchesState, json::encodeToJsonElement)
        putState("updated_at", value.updatedAtState, json::encodeToJsonElement)
        putState("user_view_type", value.userViewTypeState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun userSearchResultItem(block: UserSearchResultItem.Builder.() -> Unit): UserSearchResultItem = UserSearchResultItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("UserSearchResultItem is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("UserSearchResultItem property '" + name + "' is not nullable")
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
