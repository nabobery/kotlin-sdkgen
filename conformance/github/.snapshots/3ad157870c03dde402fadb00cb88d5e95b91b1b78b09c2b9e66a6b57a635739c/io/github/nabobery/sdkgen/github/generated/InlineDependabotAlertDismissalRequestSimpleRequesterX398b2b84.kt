package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The user who requested the dismissal.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/dependabot-alert-dismissal-request-simple/properties/requester
 */
@Serializable(with = InlineDependabotAlertDismissalRequestSimpleRequesterX398b2b84.Serializer::class)
public class InlineDependabotAlertDismissalRequestSimpleRequesterX398b2b84(
  /**
   * The unique identifier of the user.
   */
  public val id: Int? = null,
  /**
   * The login name of the user.
   */
  public val login: String? = null,
) {
  public class Builder {
    /**
     * The unique identifier of the user.
     */
    public var id: Int? = null

    /**
     * The login name of the user.
     */
    public var login: String? = null

    public fun build(): InlineDependabotAlertDismissalRequestSimpleRequesterX398b2b84 = InlineDependabotAlertDismissalRequestSimpleRequesterX398b2b84(
      id = id,
      login = login,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineDependabotAlertDismissalRequestSimpleRequesterX398b2b84 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineDependabotAlertDismissalRequestSimpleRequesterX398b2b84> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDependabotAlertDismissalRequestSimpleRequesterX398b2b84 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDependabotAlertDismissalRequestSimpleRequesterX398b2b84")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineDependabotAlertDismissalRequestSimpleRequesterX398b2b84 must be a JSON object")
      return InlineDependabotAlertDismissalRequestSimpleRequesterX398b2b84(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        login = rawObject["login"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineDependabotAlertDismissalRequestSimpleRequesterX398b2b84) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineDependabotAlertDismissalRequestSimpleRequesterX398b2b84")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.login?.let { put("login", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineDependabotAlertDismissalRequestSimpleRequesterX398b2b84(block: InlineDependabotAlertDismissalRequestSimpleRequesterX398b2b84.Builder.() -> Unit): InlineDependabotAlertDismissalRequestSimpleRequesterX398b2b84 = InlineDependabotAlertDismissalRequestSimpleRequesterX398b2b84.build(block)
