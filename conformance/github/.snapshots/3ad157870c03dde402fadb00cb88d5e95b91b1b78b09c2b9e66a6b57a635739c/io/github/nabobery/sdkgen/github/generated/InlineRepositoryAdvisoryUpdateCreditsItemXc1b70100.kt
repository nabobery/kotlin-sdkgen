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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/repository-advisory-update/properties/credits/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-advisory-update/properties/credits/items
 */
@Serializable(with = InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100.Serializer::class)
public class InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100(
  /**
   * The username of the user credited.
   */
  public val login: String,
  public val type: SecurityAdvisoryCreditTypes,
) {
  public class Builder {
    private var loginValue: String? = null

    public var login: String
      get() = requireNotNull(loginValue) { "login is required" }
      set(`value`) {
        loginValue = value
      }

    private var typeValue: SecurityAdvisoryCreditTypes? = null

    public var type: SecurityAdvisoryCreditTypes
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100 {
      check(loginValue != null) { "login is required" }
      check(typeValue != null) { "type is required" }
      return InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100(
        login = login,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100 must be a JSON object")
      val login = json.decodeRequired<String>(rawObject, "login")
      val type = json.decodeRequired<SecurityAdvisoryCreditTypes>(rawObject, "type")
      return InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100(
        login = login,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("login", value.login)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryAdvisoryUpdateCreditsItemXc1b70100(block: InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100.Builder.() -> Unit): InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100 = InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100 property '" + name + "' is not nullable")
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
