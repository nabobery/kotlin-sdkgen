package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/paths/~1user/patch/requestBody/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1user/patch/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineUserPatchRequestJsonXcc70b87c.Serializer::class)
public class InlineUserPatchRequestJsonXcc70b87c internal constructor(
  private val bioState: FieldState<String>,
  private val blogState: FieldState<String>,
  private val companyState: FieldState<String>,
  private val emailState: FieldState<String>,
  private val hireableState: FieldState<Boolean>,
  private val locationState: FieldState<String>,
  private val nameState: FieldState<String>,
  private val twitterUsernameState: FieldState<String?>,
) {
  /**
   * The new short biography of the user.
   */
  public val bio: String?
    get() = bioState.valueOrNull()

  /**
   * The new blog URL of the user.
   */
  public val blog: String?
    get() = blogState.valueOrNull()

  /**
   * The new company of the user.
   */
  public val company: String?
    get() = companyState.valueOrNull()

  /**
   * The publicly visible email address of the user.
   */
  public val email: String?
    get() = emailState.valueOrNull()

  /**
   * The new hiring availability of the user.
   */
  public val hireable: Boolean?
    get() = hireableState.valueOrNull()

  /**
   * The new location of the user.
   */
  public val location: String?
    get() = locationState.valueOrNull()

  /**
   * The new name of the user.
   */
  public val name: String?
    get() = nameState.valueOrNull()

  /**
   * The new Twitter username of the user.
   */
  public val twitterUsername: String?
    get() = twitterUsernameState.valueOrNull()

  public constructor() : this(bioState = FieldState.Absent,
  blogState = FieldState.Absent,
  companyState = FieldState.Absent,
  emailState = FieldState.Absent,
  hireableState = FieldState.Absent,
  locationState = FieldState.Absent,
  nameState = FieldState.Absent,
  twitterUsernameState = FieldState.Absent,
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
   * Returns the wire presence of `email`.
   */
  public fun emailPresence(): FieldPresence = emailState.presence

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
   * Returns the wire presence of `twitter_username`.
   */
  public fun twitterUsernamePresence(): FieldPresence = twitterUsernameState.presence

  public class Builder {
    private var bioState: FieldState<String> = FieldState.Absent

    /**
     * The new short biography of the user.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var bio: String?
      get() = bioState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "bio is not nullable; call unsetBio() to omit it" }
        bioState = FieldState.Value(present)
      }

    private var blogState: FieldState<String> = FieldState.Absent

    /**
     * The new blog URL of the user.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var blog: String?
      get() = blogState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "blog is not nullable; call unsetBlog() to omit it" }
        blogState = FieldState.Value(present)
      }

    private var companyState: FieldState<String> = FieldState.Absent

    /**
     * The new company of the user.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var company: String?
      get() = companyState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "company is not nullable; call unsetCompany() to omit it" }
        companyState = FieldState.Value(present)
      }

    private var emailState: FieldState<String> = FieldState.Absent

    /**
     * The publicly visible email address of the user.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var email: String?
      get() = emailState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "email is not nullable; call unsetEmail() to omit it" }
        emailState = FieldState.Value(present)
      }

    private var hireableState: FieldState<Boolean> = FieldState.Absent

    /**
     * The new hiring availability of the user.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var hireable: Boolean?
      get() = hireableState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "hireable is not nullable; call unsetHireable() to omit it" }
        hireableState = FieldState.Value(present)
      }

    private var locationState: FieldState<String> = FieldState.Absent

    /**
     * The new location of the user.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var location: String?
      get() = locationState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "location is not nullable; call unsetLocation() to omit it" }
        locationState = FieldState.Value(present)
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * The new name of the user.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    private var twitterUsernameState: FieldState<String?> = FieldState.Absent

    /**
     * The new Twitter username of the user.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var twitterUsername: String?
      get() = twitterUsernameState.valueOrNull()
      set(`value`) {
        twitterUsernameState = value.toNullableFieldState()
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
     * Omits `email` from serialized output.
     */
    public fun unsetEmail() {
      emailState = FieldState.Absent
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
     * Omits `twitter_username` from serialized output.
     */
    public fun unsetTwitterUsername() {
      twitterUsernameState = FieldState.Absent
    }

    public fun build(): InlineUserPatchRequestJsonXcc70b87c = InlineUserPatchRequestJsonXcc70b87c(
      bioState = bioState,
      blogState = blogState,
      companyState = companyState,
      emailState = emailState,
      hireableState = hireableState,
      locationState = locationState,
      nameState = nameState,
      twitterUsernameState = twitterUsernameState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserPatchRequestJsonXcc70b87c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUserPatchRequestJsonXcc70b87c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserPatchRequestJsonXcc70b87c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserPatchRequestJsonXcc70b87c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserPatchRequestJsonXcc70b87c must be a JSON object")
      return InlineUserPatchRequestJsonXcc70b87c(
        bioState = json.decodeOptional(rawObject, "bio", nullable = false),
        blogState = json.decodeOptional(rawObject, "blog", nullable = false),
        companyState = json.decodeOptional(rawObject, "company", nullable = false),
        emailState = json.decodeOptional(rawObject, "email", nullable = false),
        hireableState = json.decodeOptional(rawObject, "hireable", nullable = false),
        locationState = json.decodeOptional(rawObject, "location", nullable = false),
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
        twitterUsernameState = json.decodeOptional(rawObject, "twitter_username", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserPatchRequestJsonXcc70b87c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserPatchRequestJsonXcc70b87c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("bio", value.bioState, json::encodeToJsonElement)
        putState("blog", value.blogState, json::encodeToJsonElement)
        putState("company", value.companyState, json::encodeToJsonElement)
        putState("email", value.emailState, json::encodeToJsonElement)
        putState("hireable", value.hireableState, json::encodeToJsonElement)
        putState("location", value.locationState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("twitter_username", value.twitterUsernameState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserPatchRequestJsonXcc70b87c(block: InlineUserPatchRequestJsonXcc70b87c.Builder.() -> Unit): InlineUserPatchRequestJsonXcc70b87c = InlineUserPatchRequestJsonXcc70b87c.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineUserPatchRequestJsonXcc70b87c property '" + name + "' is not nullable")
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
