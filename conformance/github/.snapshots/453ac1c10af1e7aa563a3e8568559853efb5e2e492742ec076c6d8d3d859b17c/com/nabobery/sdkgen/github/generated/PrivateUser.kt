package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
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
 * Private User
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/private-user
 */
@Serializable(with = PrivateUser.Serializer::class)
public class PrivateUser internal constructor(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val avatarUrl: String,
  public val bio: String?,
  public val blog: String?,
  public val collaborators: Int,
  public val company: String?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val diskUsage: Int,
  /**
   * Wire format: `email`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val email: String?,
  public val eventsUrl: String,
  public val followers: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val followersUrl: String,
  public val following: Int,
  public val followingUrl: String,
  public val gistsUrl: String,
  public val gravatarId: String?,
  public val hireable: Boolean?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Long,
  public val location: String?,
  public val login: String,
  public val name: String?,
  public val nodeId: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val organizationsUrl: String,
  public val ownedPrivateRepos: Int,
  public val privateGists: Int,
  public val publicGists: Int,
  public val publicRepos: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val receivedEventsUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val reposUrl: String,
  public val siteAdmin: Boolean,
  public val starredUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val subscriptionsUrl: String,
  public val totalPrivateRepos: Int,
  public val twoFactorAuthentication: Boolean,
  public val type: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val businessPlusState: FieldState<Boolean>,
  private val ldapDnState: FieldState<String>,
  private val notificationEmailState: FieldState<String?>,
  private val planState: FieldState<InlinePrivateUserPlanXcd5b23e2>,
  private val twitterUsernameState: FieldState<String?>,
  private val userViewTypeState: FieldState<String>,
) {
  public val businessPlus: Boolean?
    get() = businessPlusState.valueOrNull()

  public val ldapDn: String?
    get() = ldapDnState.valueOrNull()

  /**
   * Wire format: `email`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val notificationEmail: String?
    get() = notificationEmailState.valueOrNull()

  public val plan: InlinePrivateUserPlanXcd5b23e2?
    get() = planState.valueOrNull()

  public val twitterUsername: String?
    get() = twitterUsernameState.valueOrNull()

  public val userViewType: String?
    get() = userViewTypeState.valueOrNull()

  public constructor(
    avatarUrl: String,
    bio: String?,
    blog: String?,
    collaborators: Int,
    company: String?,
    createdAt: String,
    diskUsage: Int,
    email: String?,
    eventsUrl: String,
    followers: Int,
    followersUrl: String,
    following: Int,
    followingUrl: String,
    gistsUrl: String,
    gravatarId: String?,
    hireable: Boolean?,
    htmlUrl: String,
    id: Long,
    location: String?,
    login: String,
    name: String?,
    nodeId: String,
    organizationsUrl: String,
    ownedPrivateRepos: Int,
    privateGists: Int,
    publicGists: Int,
    publicRepos: Int,
    receivedEventsUrl: String,
    reposUrl: String,
    siteAdmin: Boolean,
    starredUrl: String,
    subscriptionsUrl: String,
    totalPrivateRepos: Int,
    twoFactorAuthentication: Boolean,
    type: String,
    updatedAt: String,
    url: String,
  ) : this(avatarUrl = avatarUrl,
  bio = bio,
  blog = blog,
  collaborators = collaborators,
  company = company,
  createdAt = createdAt,
  diskUsage = diskUsage,
  email = email,
  eventsUrl = eventsUrl,
  followers = followers,
  followersUrl = followersUrl,
  following = following,
  followingUrl = followingUrl,
  gistsUrl = gistsUrl,
  gravatarId = gravatarId,
  hireable = hireable,
  htmlUrl = htmlUrl,
  id = id,
  location = location,
  login = login,
  name = name,
  nodeId = nodeId,
  organizationsUrl = organizationsUrl,
  ownedPrivateRepos = ownedPrivateRepos,
  privateGists = privateGists,
  publicGists = publicGists,
  publicRepos = publicRepos,
  receivedEventsUrl = receivedEventsUrl,
  reposUrl = reposUrl,
  siteAdmin = siteAdmin,
  starredUrl = starredUrl,
  subscriptionsUrl = subscriptionsUrl,
  totalPrivateRepos = totalPrivateRepos,
  twoFactorAuthentication = twoFactorAuthentication,
  type = type,
  updatedAt = updatedAt,
  url = url,
  businessPlusState = FieldState.Absent,
  ldapDnState = FieldState.Absent,
  notificationEmailState = FieldState.Absent,
  planState = FieldState.Absent,
  twitterUsernameState = FieldState.Absent,
  userViewTypeState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `business_plus`.
   */
  public fun businessPlusPresence(): FieldPresence = businessPlusState.presence

  /**
   * Returns the wire presence of `ldap_dn`.
   */
  public fun ldapDnPresence(): FieldPresence = ldapDnState.presence

  /**
   * Returns the wire presence of `notification_email`.
   */
  public fun notificationEmailPresence(): FieldPresence = notificationEmailState.presence

  /**
   * Returns the wire presence of `plan`.
   */
  public fun planPresence(): FieldPresence = planState.presence

  /**
   * Returns the wire presence of `twitter_username`.
   */
  public fun twitterUsernamePresence(): FieldPresence = twitterUsernameState.presence

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

    private var collaboratorsValue: Int? = null

    public var collaborators: Int
      get() = requireNotNull(collaboratorsValue) { "collaborators is required" }
      set(`value`) {
        collaboratorsValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var diskUsageValue: Int? = null

    public var diskUsage: Int
      get() = requireNotNull(diskUsageValue) { "diskUsage is required" }
      set(`value`) {
        diskUsageValue = value
      }

    private var eventsUrlValue: String? = null

    public var eventsUrl: String
      get() = requireNotNull(eventsUrlValue) { "eventsUrl is required" }
      set(`value`) {
        eventsUrlValue = value
      }

    private var followersValue: Int? = null

    public var followers: Int
      get() = requireNotNull(followersValue) { "followers is required" }
      set(`value`) {
        followersValue = value
      }

    private var followersUrlValue: String? = null

    public var followersUrl: String
      get() = requireNotNull(followersUrlValue) { "followersUrl is required" }
      set(`value`) {
        followersUrlValue = value
      }

    private var followingValue: Int? = null

    public var following: Int
      get() = requireNotNull(followingValue) { "following is required" }
      set(`value`) {
        followingValue = value
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

    private var ownedPrivateReposValue: Int? = null

    public var ownedPrivateRepos: Int
      get() = requireNotNull(ownedPrivateReposValue) { "ownedPrivateRepos is required" }
      set(`value`) {
        ownedPrivateReposValue = value
      }

    private var privateGistsValue: Int? = null

    public var privateGists: Int
      get() = requireNotNull(privateGistsValue) { "privateGists is required" }
      set(`value`) {
        privateGistsValue = value
      }

    private var publicGistsValue: Int? = null

    public var publicGists: Int
      get() = requireNotNull(publicGistsValue) { "publicGists is required" }
      set(`value`) {
        publicGistsValue = value
      }

    private var publicReposValue: Int? = null

    public var publicRepos: Int
      get() = requireNotNull(publicReposValue) { "publicRepos is required" }
      set(`value`) {
        publicReposValue = value
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

    private var totalPrivateReposValue: Int? = null

    public var totalPrivateRepos: Int
      get() = requireNotNull(totalPrivateReposValue) { "totalPrivateRepos is required" }
      set(`value`) {
        totalPrivateReposValue = value
      }

    private var twoFactorAuthenticationValue: Boolean? = null

    public var twoFactorAuthentication: Boolean
      get() = requireNotNull(twoFactorAuthenticationValue) { "twoFactorAuthentication is required" }
      set(`value`) {
        twoFactorAuthenticationValue = value
      }

    private var typeValue: String? = null

    public var type: String
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

    private var bioState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var bio: String?
      get() = bioState.valueOrNull()
      set(`value`) {
        bioState = value.toNullableFieldState()
      }

    private var blogState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var blog: String?
      get() = blogState.valueOrNull()
      set(`value`) {
        blogState = value.toNullableFieldState()
      }

    private var companyState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var company: String?
      get() = companyState.valueOrNull()
      set(`value`) {
        companyState = value.toNullableFieldState()
      }

    private var emailState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `email`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var email: String?
      get() = emailState.valueOrNull()
      set(`value`) {
        emailState = value.toNullableFieldState()
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

    private var hireableState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var hireable: Boolean?
      get() = hireableState.valueOrNull()
      set(`value`) {
        hireableState = value.toNullableFieldState()
      }

    private var locationState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var location: String?
      get() = locationState.valueOrNull()
      set(`value`) {
        locationState = value.toNullableFieldState()
      }

    private var nameState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        nameState = value.toNullableFieldState()
      }

    private var businessPlusState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var businessPlus: Boolean?
      get() = businessPlusState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "businessPlus is not nullable; call unsetBusinessPlus() to omit it" }
        businessPlusState = FieldState.Value(present)
      }

    private var ldapDnState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var ldapDn: String?
      get() = ldapDnState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "ldapDn is not nullable; call unsetLdapDn() to omit it" }
        ldapDnState = FieldState.Value(present)
      }

    private var notificationEmailState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `email`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var notificationEmail: String?
      get() = notificationEmailState.valueOrNull()
      set(`value`) {
        notificationEmailState = value.toNullableFieldState()
      }

    private var planState: FieldState<InlinePrivateUserPlanXcd5b23e2> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var plan: InlinePrivateUserPlanXcd5b23e2?
      get() = planState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "plan is not nullable; call unsetPlan() to omit it" }
        planState = FieldState.Value(present)
      }

    private var twitterUsernameState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var twitterUsername: String?
      get() = twitterUsernameState.valueOrNull()
      set(`value`) {
        twitterUsernameState = value.toNullableFieldState()
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
     * Omits `business_plus` from serialized output.
     */
    public fun unsetBusinessPlus() {
      businessPlusState = FieldState.Absent
    }

    /**
     * Omits `ldap_dn` from serialized output.
     */
    public fun unsetLdapDn() {
      ldapDnState = FieldState.Absent
    }

    /**
     * Omits `notification_email` from serialized output.
     */
    public fun unsetNotificationEmail() {
      notificationEmailState = FieldState.Absent
    }

    /**
     * Omits `plan` from serialized output.
     */
    public fun unsetPlan() {
      planState = FieldState.Absent
    }

    /**
     * Omits `twitter_username` from serialized output.
     */
    public fun unsetTwitterUsername() {
      twitterUsernameState = FieldState.Absent
    }

    /**
     * Omits `user_view_type` from serialized output.
     */
    public fun unsetUserViewType() {
      userViewTypeState = FieldState.Absent
    }

    public fun build(): PrivateUser {
      check(avatarUrlValue != null) { "avatarUrl is required" }
      check(collaboratorsValue != null) { "collaborators is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(diskUsageValue != null) { "diskUsage is required" }
      check(eventsUrlValue != null) { "eventsUrl is required" }
      check(followersValue != null) { "followers is required" }
      check(followersUrlValue != null) { "followersUrl is required" }
      check(followingValue != null) { "following is required" }
      check(followingUrlValue != null) { "followingUrl is required" }
      check(gistsUrlValue != null) { "gistsUrl is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(loginValue != null) { "login is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(organizationsUrlValue != null) { "organizationsUrl is required" }
      check(ownedPrivateReposValue != null) { "ownedPrivateRepos is required" }
      check(privateGistsValue != null) { "privateGists is required" }
      check(publicGistsValue != null) { "publicGists is required" }
      check(publicReposValue != null) { "publicRepos is required" }
      check(receivedEventsUrlValue != null) { "receivedEventsUrl is required" }
      check(reposUrlValue != null) { "reposUrl is required" }
      check(siteAdminValue != null) { "siteAdmin is required" }
      check(starredUrlValue != null) { "starredUrl is required" }
      check(subscriptionsUrlValue != null) { "subscriptionsUrl is required" }
      check(totalPrivateReposValue != null) { "totalPrivateRepos is required" }
      check(twoFactorAuthenticationValue != null) { "twoFactorAuthentication is required" }
      check(typeValue != null) { "type is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(bioState !== FieldState.Absent) { "bio is required, even when null" }
      check(blogState !== FieldState.Absent) { "blog is required, even when null" }
      check(companyState !== FieldState.Absent) { "company is required, even when null" }
      check(emailState !== FieldState.Absent) { "email is required, even when null" }
      check(gravatarIdState !== FieldState.Absent) { "gravatarId is required, even when null" }
      check(hireableState !== FieldState.Absent) { "hireable is required, even when null" }
      check(locationState !== FieldState.Absent) { "location is required, even when null" }
      check(nameState !== FieldState.Absent) { "name is required, even when null" }
      return PrivateUser(
        avatarUrl = avatarUrl,
        bio = bioState.valueOrNull(),
        blog = blogState.valueOrNull(),
        collaborators = collaborators,
        company = companyState.valueOrNull(),
        createdAt = createdAt,
        diskUsage = diskUsage,
        email = emailState.valueOrNull(),
        eventsUrl = eventsUrl,
        followers = followers,
        followersUrl = followersUrl,
        following = following,
        followingUrl = followingUrl,
        gistsUrl = gistsUrl,
        gravatarId = gravatarIdState.valueOrNull(),
        hireable = hireableState.valueOrNull(),
        htmlUrl = htmlUrl,
        id = id,
        location = locationState.valueOrNull(),
        login = login,
        name = nameState.valueOrNull(),
        nodeId = nodeId,
        organizationsUrl = organizationsUrl,
        ownedPrivateRepos = ownedPrivateRepos,
        privateGists = privateGists,
        publicGists = publicGists,
        publicRepos = publicRepos,
        receivedEventsUrl = receivedEventsUrl,
        reposUrl = reposUrl,
        siteAdmin = siteAdmin,
        starredUrl = starredUrl,
        subscriptionsUrl = subscriptionsUrl,
        totalPrivateRepos = totalPrivateRepos,
        twoFactorAuthentication = twoFactorAuthentication,
        type = type,
        updatedAt = updatedAt,
        url = url,
        businessPlusState = businessPlusState,
        ldapDnState = ldapDnState,
        notificationEmailState = notificationEmailState,
        planState = planState,
        twitterUsernameState = twitterUsernameState,
        userViewTypeState = userViewTypeState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PrivateUser = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PrivateUser> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PrivateUser {
      val jsonDecoder = decoder.requireJsonDecoder("PrivateUser")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PrivateUser must be a JSON object")
      val avatarUrl = json.decodeRequired<String>(rawObject, "avatar_url")
      val collaborators = json.decodeRequired<Int>(rawObject, "collaborators")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val diskUsage = json.decodeRequired<Int>(rawObject, "disk_usage")
      val eventsUrl = json.decodeRequired<String>(rawObject, "events_url")
      val followers = json.decodeRequired<Int>(rawObject, "followers")
      val followersUrl = json.decodeRequired<String>(rawObject, "followers_url")
      val following = json.decodeRequired<Int>(rawObject, "following")
      val followingUrl = json.decodeRequired<String>(rawObject, "following_url")
      val gistsUrl = json.decodeRequired<String>(rawObject, "gists_url")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val login = json.decodeRequired<String>(rawObject, "login")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val organizationsUrl = json.decodeRequired<String>(rawObject, "organizations_url")
      val ownedPrivateRepos = json.decodeRequired<Int>(rawObject, "owned_private_repos")
      val privateGists = json.decodeRequired<Int>(rawObject, "private_gists")
      val publicGists = json.decodeRequired<Int>(rawObject, "public_gists")
      val publicRepos = json.decodeRequired<Int>(rawObject, "public_repos")
      val receivedEventsUrl = json.decodeRequired<String>(rawObject, "received_events_url")
      val reposUrl = json.decodeRequired<String>(rawObject, "repos_url")
      val siteAdmin = json.decodeRequired<Boolean>(rawObject, "site_admin")
      val starredUrl = json.decodeRequired<String>(rawObject, "starred_url")
      val subscriptionsUrl = json.decodeRequired<String>(rawObject, "subscriptions_url")
      val totalPrivateRepos = json.decodeRequired<Int>(rawObject, "total_private_repos")
      val twoFactorAuthentication = json.decodeRequired<Boolean>(rawObject, "two_factor_authentication")
      val type = json.decodeRequired<String>(rawObject, "type")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("bio")) {
        throw SerializationException("PrivateUser is missing required property 'bio'")
      }
      val bio = rawObject["bio"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("blog")) {
        throw SerializationException("PrivateUser is missing required property 'blog'")
      }
      val blog = rawObject["blog"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("company")) {
        throw SerializationException("PrivateUser is missing required property 'company'")
      }
      val company = rawObject["company"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("email")) {
        throw SerializationException("PrivateUser is missing required property 'email'")
      }
      val email = rawObject["email"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("gravatar_id")) {
        throw SerializationException("PrivateUser is missing required property 'gravatar_id'")
      }
      val gravatarId = rawObject["gravatar_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("hireable")) {
        throw SerializationException("PrivateUser is missing required property 'hireable'")
      }
      val hireable = rawObject["hireable"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(requireNotNull(element)) }
      if (!rawObject.containsKey("location")) {
        throw SerializationException("PrivateUser is missing required property 'location'")
      }
      val location = rawObject["location"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("name")) {
        throw SerializationException("PrivateUser is missing required property 'name'")
      }
      val name = rawObject["name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return PrivateUser(
        avatarUrl = avatarUrl,
        bio = bio,
        blog = blog,
        collaborators = collaborators,
        company = company,
        createdAt = createdAt,
        diskUsage = diskUsage,
        email = email,
        eventsUrl = eventsUrl,
        followers = followers,
        followersUrl = followersUrl,
        following = following,
        followingUrl = followingUrl,
        gistsUrl = gistsUrl,
        gravatarId = gravatarId,
        hireable = hireable,
        htmlUrl = htmlUrl,
        id = id,
        location = location,
        login = login,
        name = name,
        nodeId = nodeId,
        organizationsUrl = organizationsUrl,
        ownedPrivateRepos = ownedPrivateRepos,
        privateGists = privateGists,
        publicGists = publicGists,
        publicRepos = publicRepos,
        receivedEventsUrl = receivedEventsUrl,
        reposUrl = reposUrl,
        siteAdmin = siteAdmin,
        starredUrl = starredUrl,
        subscriptionsUrl = subscriptionsUrl,
        totalPrivateRepos = totalPrivateRepos,
        twoFactorAuthentication = twoFactorAuthentication,
        type = type,
        updatedAt = updatedAt,
        url = url,
        businessPlusState = json.decodeOptional(rawObject, "business_plus", nullable = false),
        ldapDnState = json.decodeOptional(rawObject, "ldap_dn", nullable = false),
        notificationEmailState = json.decodeOptional(rawObject, "notification_email", nullable = true),
        planState = json.decodeOptional(rawObject, "plan", nullable = false),
        twitterUsernameState = json.decodeOptional(rawObject, "twitter_username", nullable = true),
        userViewTypeState = json.decodeOptional(rawObject, "user_view_type", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: PrivateUser) {
      val jsonEncoder = encoder.requireJsonEncoder("PrivateUser")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("avatar_url", value.avatarUrl)
        put("bio", value.bio?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("blog", value.blog?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("collaborators", json.encodeToJsonElement(value.collaborators))
        put("company", value.company?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", value.createdAt)
        put("disk_usage", json.encodeToJsonElement(value.diskUsage))
        put("email", value.email?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("events_url", value.eventsUrl)
        put("followers", json.encodeToJsonElement(value.followers))
        put("followers_url", value.followersUrl)
        put("following", json.encodeToJsonElement(value.following))
        put("following_url", value.followingUrl)
        put("gists_url", value.gistsUrl)
        put("gravatar_id", value.gravatarId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("hireable", value.hireable?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("location", value.location?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("login", value.login)
        put("name", value.name?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("node_id", value.nodeId)
        put("organizations_url", value.organizationsUrl)
        put("owned_private_repos", json.encodeToJsonElement(value.ownedPrivateRepos))
        put("private_gists", json.encodeToJsonElement(value.privateGists))
        put("public_gists", json.encodeToJsonElement(value.publicGists))
        put("public_repos", json.encodeToJsonElement(value.publicRepos))
        put("received_events_url", value.receivedEventsUrl)
        put("repos_url", value.reposUrl)
        put("site_admin", json.encodeToJsonElement(value.siteAdmin))
        put("starred_url", value.starredUrl)
        put("subscriptions_url", value.subscriptionsUrl)
        put("total_private_repos", json.encodeToJsonElement(value.totalPrivateRepos))
        put("two_factor_authentication", json.encodeToJsonElement(value.twoFactorAuthentication))
        put("type", value.type)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        putState("business_plus", value.businessPlusState, json::encodeToJsonElement)
        putState("ldap_dn", value.ldapDnState, json::encodeToJsonElement)
        putState("notification_email", value.notificationEmailState, json::encodeToJsonElement)
        putState("plan", value.planState, json::encodeToJsonElement)
        putState("twitter_username", value.twitterUsernameState, json::encodeToJsonElement)
        putState("user_view_type", value.userViewTypeState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun privateUser(block: PrivateUser.Builder.() -> Unit): PrivateUser = PrivateUser.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PrivateUser is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("PrivateUser property '" + name + "' is not nullable")
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
