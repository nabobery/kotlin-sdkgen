package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * Snapshot events allow you to track and react to activity in your Stripe integration. When
 * the state of another API resource changes, Stripe creates an `Event` object that contains
 * all the relevant information associated with that action, including the affected API
 * resource. For example, a successful payment triggers a `charge.succeeded` event, which
 * contains the `Charge` in the event's data property. Some actions trigger multiple events.
 * For example, if you create a new subscription for a customer, it triggers both a
 * `customer.subscription.created` event and a `charge.succeeded` event.
 *
 * Configure an event destination in your account to listen for events that represent actions
 * your integration needs to respond to. Additionally, you can retrieve an individual event or
 * a list of events from the API.
 *
 * [Connect](https://docs.stripe.com/connect) platforms can also receive event notifications
 * that occur in their connected accounts. These events include an account attribute that
 * identifies the relevant connected account.
 *
 * You can access events through the [Retrieve Event API](https://docs.stripe.com/api/events#retrieve_event)
 * for 30 days.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/event
 */
@Serializable(with = Event.Serializer::class)
public class Event(
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    public val created: Int,
    public val `data`: NotificationEventData,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
     */
    public val livemode: Boolean,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineEventObjectValueX8f118a72,
    /**
     * Number of webhooks that haven't been successfully delivered (for example, to return a 20x response) to the URLs you
     * specify.
     */
    public val pendingWebhooks: Int,
    /**
     * Description of the event (for example, `invoice.created` or `charge.refunded`).
     */
    public val type: String,
    /**
     * The connected account that originates the event.
     */
    public val account: String? = null,
    /**
     * The Stripe API version used to render `data` when the event was created. The contents of `data` never change, so
     * this value remains static regardless of the API version currently in use. This property is populated only for
     * events created on or after October 31, 2014.
     */
    public val apiVersion: String? = null,
    /**
     * Authentication context needed to fetch the event or related object.
     */
    public val context: String? = null,
    /**
     * Information on the API request that triggers the event.
     */
    public val request: InlineEventRequestXba251168? = null,
) {
    public class Builder {
        private var createdValue: Int? = null

        public var created: Int
            get() = requireNotNull(createdValue) { "created is required" }
            set(`value`) {
                createdValue = value
            }

        private var dataValue: NotificationEventData? = null

        public var `data`: NotificationEventData
            get() = requireNotNull(dataValue) { "data is required" }
            set(`value`) {
                dataValue = value
            }

        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var livemodeValue: Boolean? = null

        public var livemode: Boolean
            get() = requireNotNull(livemodeValue) { "livemode is required" }
            set(`value`) {
                livemodeValue = value
            }

        private var objectValueValue: InlineEventObjectValueX8f118a72? = null

        public var objectValue: InlineEventObjectValueX8f118a72
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var pendingWebhooksValue: Int? = null

        public var pendingWebhooks: Int
            get() = requireNotNull(pendingWebhooksValue) { "pendingWebhooks is required" }
            set(`value`) {
                pendingWebhooksValue = value
            }

        private var typeValue: String? = null

        public var type: String
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        /**
         * The connected account that originates the event.
         */
        public var account: String? = null

        /**
         * The Stripe API version used to render `data` when the event was created. The contents of `data` never change, so
         * this value remains static regardless of the API version currently in use. This property is populated only for
         * events created on or after October 31, 2014.
         */
        public var apiVersion: String? = null

        /**
         * Authentication context needed to fetch the event or related object.
         */
        public var context: String? = null

        /**
         * Information on the API request that triggers the event.
         */
        public var request: InlineEventRequestXba251168? = null

        public fun build(): Event {
            check(createdValue != null) { "created is required" }
            check(dataValue != null) { "data is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(pendingWebhooksValue != null) { "pendingWebhooks is required" }
            check(typeValue != null) { "type is required" }
            return Event(
                created = created,
                data = data,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                pendingWebhooks = pendingWebhooks,
                type = type,
                account = account,
                apiVersion = apiVersion,
                context = context,
                request = request,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): Event = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<Event> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): Event {
            val jsonDecoder = decoder.requireJsonDecoder("Event")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("Event must be a JSON object")
            val created = json.decodeRequired<Int>(rawObject, "created")
            val data = json.decodeRequired<NotificationEventData>(rawObject, "data")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val objectValue = json.decodeRequired<InlineEventObjectValueX8f118a72>(rawObject, "object")
            val pendingWebhooks = json.decodeRequired<Int>(rawObject, "pending_webhooks")
            val type = json.decodeRequired<String>(rawObject, "type")
            return Event(
                created = created,
                data = data,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                pendingWebhooks = pendingWebhooks,
                type = type,
                account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
                apiVersion =
                    rawObject["api_version"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                context = rawObject["context"]?.let { json.decodeFromJsonElement<String>(it) },
                request =
                    rawObject["request"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineEventRequestXba251168?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: Event,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("Event")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("created", json.encodeToJsonElement(value.created))
                    put("data", json.encodeToJsonElement(value.data))
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("pending_webhooks", json.encodeToJsonElement(value.pendingWebhooks))
                    put("type", value.type)
                    value.account?.let { put("account", it) }
                    value.apiVersion?.let { put("api_version", it) }
                    value.context?.let { put("context", it) }
                    value.request?.let { put("request", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun event(block: Event.Builder.() -> Unit): Event = Event.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element = raw[name] ?: throw SerializationException("Event is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
