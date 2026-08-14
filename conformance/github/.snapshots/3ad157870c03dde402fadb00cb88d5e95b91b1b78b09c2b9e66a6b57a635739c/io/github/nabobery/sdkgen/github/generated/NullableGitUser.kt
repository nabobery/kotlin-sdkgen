package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Metaproperties for Git author/committer information.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-git-user
 */
@Serializable(with = NullableGitUser.Serializer::class)
public class NullableGitUser(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val date: String? = null,
  public val email: String? = null,
  public val name: String? = null,
) {
  public class Builder {
    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var date: String? = null

    public var email: String? = null

    public var name: String? = null

    public fun build(): NullableGitUser = NullableGitUser(
      date = date,
      email = email,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): NullableGitUser = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<NullableGitUser> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): NullableGitUser {
      val jsonDecoder = decoder.requireJsonDecoder("NullableGitUser")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("NullableGitUser must be a JSON object")
      return NullableGitUser(
        date = rawObject["date"]?.let { json.decodeFromJsonElement<String>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: NullableGitUser) {
      val jsonEncoder = encoder.requireJsonEncoder("NullableGitUser")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.date?.let { put("date", it) }
        value.email?.let { put("email", it) }
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun nullableGitUser(block: NullableGitUser.Builder.() -> Unit): NullableGitUser = NullableGitUser.build(block)
